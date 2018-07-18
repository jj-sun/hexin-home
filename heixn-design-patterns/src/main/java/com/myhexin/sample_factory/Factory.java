package com.myhexin.sample_factory;

/**
 * 简单那工厂模式
 */
public class Factory {

    private Factory() {}

    public static Api createApiA() {
        return new ApiImplA();
    }

}
