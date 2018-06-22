package com.myhexin.clone.entity;

public class Student implements Cloneable{

    private String name;

    private String number;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() {
        Student stu = null;
        try {
            stu = (Student) super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        /**
         * 深复制，需要对子对象进行复制，否则，子对象只复制引用（浅复制）
         */
        stu.address = (Address) address.clone();
        return stu;
    }
}
