package com.wisely.task.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.task.scheduler");

    }

}