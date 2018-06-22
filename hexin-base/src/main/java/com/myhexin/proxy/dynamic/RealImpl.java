package com.myhexin.proxy.dynamic;

public class RealImpl implements Real {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void doOtherthing(String thing) {
        System.out.println(thing);
    }
}
