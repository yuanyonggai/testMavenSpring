package com.wisely.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =  
                 new AnnotationConfigApplicationContext("com.wisely.beanpostprocessor");
        context.close();

    }

}