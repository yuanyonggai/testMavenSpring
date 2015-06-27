package com.wisely.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.event");
        Main main =context.getBean(Main.class);
        main.pulish(context);
        context.close();

    }
    public void pulish(AnnotationConfigApplicationContext context){
        context.publishEvent(new DemoEvent(this, "22"));
    }

}