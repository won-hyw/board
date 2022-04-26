package com.mirim.biz.common;

import com.mirim.biz.user.UserVO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterReturningAdvice {

    @AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")
    public void afterReturningLog(JoinPoint jp, Object returnObj) {
        String method = jp.getSignature().getName();

        if (returnObj instanceof UserVO) {
            UserVO user = (UserVO) returnObj;
            if (user.getRole().equals("Admin")) {
                System.out.println(user.getName() + "로그인(Admin)");
            }
        }
        System.out.println("[사후처리] " + method + "() 메소드 리턴 값 : " + returnObj.toString());
    }

}
