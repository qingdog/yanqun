package com.yq.clone;

public class Person implements Cloneable {
    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // 省略构造函数、Getter&Setter方法
    @Override
    public Person clone() {
        try {
            // 下面第一行代码，是浅拷贝：仅仅会对 person 对象中的简单类型（基本类型+String+Date）进行一次数据拷贝；并不会对引用类型进行数据拷贝（仅仅会将引用类型的地址进行一次拷贝）
            Person person = (Person) super.clone();
            // 以上代码，结合以下代码，可以实现深拷贝：对 person 对象中的简单类型和引用类型对进行一次数据拷贝
            // 核心：将 引用类型 进行一次单独的处理
             person.setAddress(     person.getAddress().clone()    )        ;

            return person;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}