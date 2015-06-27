package com.wisely.meta;

import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.wisely.javaconfig.DemoService;

//@Configuration //声明是一个配置类
//@PropertySource("com/wisely/javaconfig/test.properties")
@WiselyMetaAnnotation
public class DemoConfig {

    @Bean //声明是一个bean
    public DemoService demoBean(Environment environment){
        DemoService demoService = new DemoService();
        demoService.setWord(environment.getProperty("wisely.word"));
        return demoService;
    }
}