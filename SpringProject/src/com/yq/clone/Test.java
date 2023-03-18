package com.yq.clone;

public class Test {
    public static void main(String[] args) {
        // 浅拷贝
        Person p1 = new Person(new Address("武汉"));

        Person person1Copy = p1.clone();

        System.out.println(p1.getAddress() == person1Copy.getAddress());
    }
}
