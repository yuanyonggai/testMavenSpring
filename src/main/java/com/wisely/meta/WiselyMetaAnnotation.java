package com.wisely.meta;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("com/wisely/javaconfig/test.properties")
public @interface WiselyMetaAnnotation {

}