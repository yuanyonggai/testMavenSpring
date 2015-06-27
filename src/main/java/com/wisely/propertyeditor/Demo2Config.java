package com.wisely.propertyeditor;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Demo2Config {
    @Bean
    public CustomEditorConfigurer editorConfigurer(){
        CustomEditorConfigurer editorConfigurer = new CustomEditorConfigurer();
        Map<Class<?>, Class<? extends PropertyEditor>> customEditors =
                new HashMap<Class<?>, Class<? extends PropertyEditor>>();
        customEditors.put(DemoBean2.class, DemoPropertyEditor.class);
        editorConfigurer.setCustomEditors(customEditors);
        return editorConfigurer;
    }

}