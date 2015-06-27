package com.wisely.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.conditional");
        CommandService cs = context.getBean(CommandService.class);
        System.out.println(cs.showListCommand());
        context.close();
    }
}