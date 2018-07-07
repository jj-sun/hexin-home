package com.myhexin.annotation;

public class NeedTestService {

    @NeedTest(value = "true")
    public void needTests() {
        System.out.println("需要测试");
    }

    @NeedTest
    public void notNeedTests() {
        System.out.println("不需要测试");
    }

}
