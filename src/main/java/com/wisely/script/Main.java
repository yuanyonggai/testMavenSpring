package com.wisely.script;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
@Configuration
@ImportResource("classpath:com/wisely/script/script.xml")//加载groovybean的配置文件
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.script");
        DemoService ds = context.getBean(DemoService.class);

        System.out.println(ds.sayHello());
        Thread.sleep(10000);
        System.out.println(ds.sayHello());
        context.close();
    }

}