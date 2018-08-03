package com.myhexin.validator;

import com.myhexin.util.ValidatorUtil;

/**
 * 对于参数校验工具的使用
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("sun");
        person.setAge(11);
        System.err.println(ValidatorUtil.validate(person));
        System.out.println(ValidatorUtil.validateFirstMessage(person));
    }
}
