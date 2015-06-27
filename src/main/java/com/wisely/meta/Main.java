package com.wisely.meta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wisely.javaconfig.DemoService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext("com.wisely.meta");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(demoService.sayHello());
        context.close();
    }

}