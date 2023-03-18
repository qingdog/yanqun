package com.yq;

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

    //原则：内容是否相同
    // 分析：什么是 Person对象 的内容相同 -> 所有的属性相同，即内容相同，即equals()相等
    // p1(zs,170,B,1999,9.912:21:22  ,66.6kg ,陕西西安莲湖区xxxXX1-2-1)  p2(zs,170,B,1999,9.912:21:22  ,66.6kg ,陕西西安莲湖区xxxXX1-2-1)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//引用地址是否相同
            return true;
        }
        //name  age

        // 当前对象 this   ,比较对象 obj
        if(obj instanceof  Person){
            Person per = (Person)obj ;
            //用传入的per，和当前对象this比较
            if(this.name.equals(per.getName())  &&  this.age==per.getAge() ){
                return true ;// 两个Person对象的内容相同，即equals返回值为true
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Person p1 = new Person(23,"zs") ;
        Person p2 = new Person(23,"zs") ;
        System.out.println(  p1.equals(p2) );
    }
}