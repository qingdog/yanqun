package com.yq;

import java.math.BigDecimal;

public class Practice2013 {
    public static void main(String[] args) {
        System.out.println(  3 * 0.3 );
        System.out.println(3 * 0.3f );
        System.out.println(3 * 0.3 == 0.9);
        System.out.println(3 * 0.3f == 0.9);
        System.out.println(new BigDecimal("3").multiply( new BigDecimal("0.3")));


    }
}
