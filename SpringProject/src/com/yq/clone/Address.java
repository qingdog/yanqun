package com.yq.clone;

public class Address implements Cloneable{
    private String name;
    public Address(String name){
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 省略构造函数、Getter&Setter方法
    @Override  // @Override 代表重写
    public Address clone() {
        try {
            Address address = (Address) super.clone();// 调用Cloneable中的clone()方法即可实现克隆操作
            return  address ;
            // A 调用  Cloneable.clone() ，则返回一个 克隆后的 A

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}