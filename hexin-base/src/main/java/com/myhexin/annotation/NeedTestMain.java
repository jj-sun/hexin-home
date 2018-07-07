package com.myhexin.annotation;

import java.lang.reflect.Method;

/**
 * 注解学习使用
 */
public class NeedTestMain {
    public static void main(String[] args) {
        Class clzz = NeedTestService.class;
        Method[] methods = clzz.getDeclaredMethods();

        for (Method method : methods) {
            if (method != null) {
                System.out.println(method.getName());
                NeedTest annotation = method.getAnnotation(NeedTest.class);
                if (annotation != null) {
                    System.out.println(annotation.value());
                }

            }

        }
    }
}
