package com.wisely.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.scan("com.wisely.profile");
        context.refresh();
        context.close();

    }

}