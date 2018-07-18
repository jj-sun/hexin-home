package com.myhexin.facade;

/**
 * 外观模式，经常使用于service层，将多个mapper方法，集中在一个service方法中实现具体的功能。
 */
public class Facade {

    public void facade() {
        Api a = new ApiImplA();
        Api b = new ApiImplB();
        a.test();
        b.test();
    }

}
