package com.yq;

public class DecorateDemo {
    // 包装类 习题二
    private static Integer i;
    public static void demo02() {
        if (i == 0) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        demo02();

        /* 包装类习题一
        Integer f1 = 100, f2 = 100, f3 = 200, f4 = 200 ,f5 =300,f6=300;
        System.out.println(f1 == f2); // true
        // f3=new Integer(200)  ; f4= new Integer(200) ；
        System.out.println(f3 == f4); // false
        System.out.println(f5 == f6); // false
        */


    }
}
