package com.yq.equalsdemo;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        Person p1 = new Person(23,"zs") ;
        Person p2 = new Person(23,"zs") ;
        System.out.println(p1 .equals( p2));
        /*
            p1 既然“等于”p2，那么 对 p1的操作，相当于对 p2的操作
            map.get(p1)  与 map.get(p2) 的值相等
            p1 .equals( p2) 结果为 true，因该得到结论：
                    p1 和 p2的属性值全相等
            解决方案：需要将 p1 和 p2 的hashcode 属性也相等-> 重写hashcode()方法
         */
        map.put(p1,"A");
        map.put(p2,"B");
        System.out.println(       map.get(p1)              );
        System.out.println(       map.get(p2)              );
//        System.out.println(       map.get(p1) .hashCode()             );
//        System.out.println(       map.get(p2) .hashCode()             );
    }
}
