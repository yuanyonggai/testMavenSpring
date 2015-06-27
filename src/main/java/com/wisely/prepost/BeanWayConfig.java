package com.wisely.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeanWayConfig {
    @Bean(initMethod="init",destroyMethod="destroy")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }
}