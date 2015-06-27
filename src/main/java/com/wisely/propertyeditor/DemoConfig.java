package com.wisely.propertyeditor;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
    @Bean
    public CustomDateEditor dateEditor(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return new CustomDateEditor(dateFormat, true);
    }
}