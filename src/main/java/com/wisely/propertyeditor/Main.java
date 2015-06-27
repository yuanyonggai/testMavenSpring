package com.wisely.propertyeditor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.propertyeditor");
        DemoBean0 demoBean = context.getBean(DemoBean0.class);
        System.out.println(demoBean.getDemoDate());
        context.close();
    }
}