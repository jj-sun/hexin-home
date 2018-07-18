package com.myhexin.singleton;

/**
 * 懒汉式
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

/**
 * 恶汉式
 */
class SingletonA {

    private static SingletonA singletonA = new SingletonA();

    private SingletonA() {}

    public static SingletonA getInstanceA() {
        return singletonA;
    }

}
