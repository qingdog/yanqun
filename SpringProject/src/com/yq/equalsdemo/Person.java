package com.yq.equalsdemo;

public class Person {
    private String name;
    private int age ;

    public Person() {
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        // 当前对象 this   ,比较对象 obj
        if(obj instanceof Person){
            Person per = (Person)obj ;
            //用传入的per，和当前对象this比较
            if(this.name.equals(per.getName())  &&  this.age==per.getAge() ){
                return true ;// 两个Person对象的内容相同，即equals返回值为true
            }
        }
        return false;
    }

    @Override
    public int hashCode() {//name   age
        return  name.hashCode() & age ; //只要name和age相同，则结果相等
    }

    public static void main(String[] args) {
        Person p1 = new Person(23,"zs") ;
        Person p2 = new Person(23,"zs") ;
        System.out.println(  p1.equals(p2) );
    }
}