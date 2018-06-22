package com.myhexin.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class JDKDynamicMain {

    public static void main(String[] args) {

        //使用
        Real real = new RealImpl();

        JDKProxy jdkProxy = new JDKProxy(real);

        Real proxyReal = (Real)Proxy.newProxyInstance(real.getClass().getClassLoader(),
                real.getClass().getInterfaces(),
                jdkProxy);

        proxyReal.doSomething();

        proxyReal.doOtherthing("吃苹果");

    }

}
