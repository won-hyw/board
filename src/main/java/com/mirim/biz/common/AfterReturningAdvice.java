package com.mirim.biz.common;

public class AfterReturningAdvice {
    public void afterReturningLog() {
        System.out.println("[사후처리] 결과값 리턴 후 동작");
    }
}
