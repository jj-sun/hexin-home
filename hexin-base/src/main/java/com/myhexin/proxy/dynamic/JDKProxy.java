package com.myhexin.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler {

    private Real real;

    public JDKProxy(Real real) {
        this.real = real;
    }

    /**
     * 通过反射实现
     * @param proxy  最终生成的代理实例，一般不会用到
     * @param method 被代理实例的某个方法
     * @param args  被代理实例中某个方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理前");
        Object o = method.invoke(real,args);   //被代理实例的某个方法
        System.out.println("代理后");
        return o;
    }
}
