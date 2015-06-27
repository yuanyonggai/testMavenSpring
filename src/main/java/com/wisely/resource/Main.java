package com.wisely.resource;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @Value("classpath:com/wisely/resource/info.txt")
    private Resource info;

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context =
                        new AnnotationConfigApplicationContext("com.wisely.resource");
        Main main = context.getBean(Main.class);
        System.out.println(main.injectInfo());
        System.out.println("----------------------------");

        //classpath: spring的一个模拟协议,类似于http：
        Resource file = context.getResource("classpath:com/wisely/resource/info.txt");
        System.out.println(IOUtils.toString(file.getInputStream()));
        System.out.println("----------------------------");

        Resource url = (UrlResource) context.getResource("http://s1.bdstatic.com/r/www/cache/static/home/js/bri_7f1fa703.js");
        System.out.println(IOUtils.toString(url.getInputStream()));
        context.close();
    }

    public String injectInfo() throws IOException{
        return IOUtils.toString(info.getInputStream());
    }

}