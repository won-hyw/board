package com.mirim.biz.common;

public class AfterAdvice {
    public void finallyLog() {
        System.out.println("[사후처리] 무조건 동작");
    }
}
