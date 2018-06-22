package com.myhexin.proxy.cglib;

import com.myhexin.proxy.dynamic.RealImpl;

public class CglibProxyMain {

    public static void main(String[] args) {

        CglibProxy cglibProxy = new CglibProxy();
        RealImpl real = (RealImpl) cglibProxy.getProxy(RealImpl.class);

        real.doSomething();
        real.doOtherthing("吃橘子");
    }

}
