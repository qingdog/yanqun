package com.yq;

import com.yq.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args)  {
            System.out.println(1/0);

            try {
                Class.forName("com.yq.entity.User");
            }catch (ClassNotFoundException e){

            }
    }
}
