package com.wisely.dsl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:com/wisely/dsl/DemoConfig.groovy")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
               new AnnotationConfigApplicationContext("com.wisely.dsl");
        DemoService ds =context.getBean(DemoService.class);
        System.out.println(ds.sayHello());
        context.close();
    }

}