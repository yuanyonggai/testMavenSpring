package com.wisely.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {
    @Bean
    public static ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource= new ReloadableResourceBundleMessageSource();
        String[] resources = {"classpath:com/wisely/i18n/messages"};
        messageSource.setBasenames(resources);
        messageSource.setCacheSeconds(1);
        return messageSource;
    }

}