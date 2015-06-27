package com.wisely.propertyeditor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.propertyeditor");
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getDemoBean2().getName()+"///"
                       +demoBean.getDemoBean2().getAddress());
        context.close();
    }
}