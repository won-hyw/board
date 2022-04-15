package com.mirim.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
        String method = pjp.getSignature().getName();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(); // before 대신
        Object returnObj = pjp.proceed();
        stopWatch.stop(); // after 역할
        System.out.println(method + "() 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
        return returnObj;
    }
}
