package com.myhexin.validator;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Person {

    @NotNull(message = "不能为空")
    @Length(max = 5,message = "长度不能多于5")
    private String name;

    @Min(value = 10,message = "年龄不能小于10")
    private int age;

    @Max(value = 5)
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
