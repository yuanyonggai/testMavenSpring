package com.wisely.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Main {
    @Autowired
    MessageSource messageSource;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.wisely.i18n");
        String nameEn = context.getMessage("wisely.name",null, Locale.US);
        String nameCn = context.getMessage("wisely.name",null, Locale.CHINA);
        System.out.println("nameEN="+nameEn);
        System.out.println("nameCN="+nameCn);

        Main main = context.getBean(Main.class);
        main.showAgeInfo(context);

        context.close();
    }

    public void showAgeInfo(AnnotationConfigApplicationContext context){
        String ageEn = context.getMessage("wisely.age",null, Locale.US);
        String ageCn = context.getMessage("wisely.age",null, Locale.CHINA);
        System.out.println("nameEN="+ageEn);
        System.out.println("nameCN="+ageCn);
    }
}