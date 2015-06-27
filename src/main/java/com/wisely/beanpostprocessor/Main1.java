package com.wisely.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                 new  AnnotationConfigApplicationContext("com.wisely.beanpostprocessor");
        DemoSelectedService dss = context.getBean(DemoSelectedService.class);
        System.out.println("os确实被修改成了"+dss.getOs());
        System.out.println("num确实被修改成了"+dss.getNum());
        context.close();

    }

}