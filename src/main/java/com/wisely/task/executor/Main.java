package com.wisely.task.executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.task.executor");
        DemoAsyncTask task = context.getBean(DemoAsyncTask.class);
        for(int i =0 ;i<10;i++){
            task.executeAsyncTask(i);
            task.executeAsyncTaskPlus(i);
        }
        context.close();

    }


}