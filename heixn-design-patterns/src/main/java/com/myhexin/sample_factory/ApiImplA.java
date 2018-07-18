package com.myhexin.sample_factory;

public class ApiImplA implements Api{

    @Override
    public void sayHello(String sayHello) {
        System.out.println("implA : " + sayHello);
    }
}
