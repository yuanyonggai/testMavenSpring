package com.wisely.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext();
        context.scan("com.wisely.profile");
        context.refresh();
        context.close();

    }

}