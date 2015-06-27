package com.wisely.springel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.springel");
        DemoService ds = context.getBean(DemoService.class);
        System.out.println("注入操作系统属性："+ds.getSystemProperties());
        System.out.println("注入操作系统名称: "+ds.getOsName());
        System.out.println("注入随机数: "+ds.getRandomNumber());
        System.out.println("注入文件 "+ds.getInfo().getFilename());
        System.out.println("注入其他bean属性: "+ds.getFromAnother());
        System.out.println("注入properties文件的属性: "+ds.getMyName());
        System.out.println("注入普通字符 "+ds.getNormal());
        context.close();

    }

}