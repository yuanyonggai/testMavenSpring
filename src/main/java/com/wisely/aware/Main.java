package com.wisely.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class Main {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.aware");
        DemoBean db = context.getBean(DemoBean.class);
        System.out.println(db.getName());
        ResourceLoader rl = db.getLoader();
        Resource r = rl.getResource("classpath:com/wisely/aware/info.txt");
        System.out.println(IOUtils.toString(r.getInputStream()));
        context.close();
    }

}