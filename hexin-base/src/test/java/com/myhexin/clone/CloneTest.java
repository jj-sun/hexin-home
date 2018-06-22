package com.myhexin.clone;

import com.myhexin.clone.entity.Address;
import com.myhexin.clone.entity.Student;
import org.junit.Test;

/**
 * 深拷贝与浅拷贝
 */
public class CloneTest {


    @Test
    public void cloneTest() {

        /**
         * 浅复制，仅是复制基本类型，引用类型只是复制的引用，并没有复制子对象,具体看Student类的clone方法。
         */
        Address address = new Address();
        address.setAddress("杭州");
        Student student1 = new Student();
        student1.setName("zhangsan");
        student1.setNumber("1");
        student1.setAddress(address);
        Student student2 = (Student) student1.clone();

        System.out.println("student1:" + student1.getName() + student1.getName() + student1.getAddress());
        System.out.println("student2:" + student2.getName() + student2.getName() + student2.getAddress());
        student2.setName("lisi");
        student2.setNumber("2");
        student2.getAddress().setAddress("济南");
        System.out.println("student1:" + student1.getName() + student1.getName() + student1.getAddress());
        System.out.println("student2:" + student2.getName() + student2.getName() + student2.getAddress());
    }
}
