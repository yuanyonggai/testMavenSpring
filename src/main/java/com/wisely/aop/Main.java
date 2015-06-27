package com.wisely.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //开启对AspectJ的@Aspect注解的支持,别忘了
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.aop");
        Demo1Service d1s = context.getBean(Demo1Service.class);
        d1s.add();
        d1s.remove();
        d1s.update();
        d1s.query();

        Demo2Service d2s = context.getBean(Demo2Service.class);
        d2s.add();
        d2s.remove();
        d2s.update();
        d2s.query();
        context.close();
    }

}