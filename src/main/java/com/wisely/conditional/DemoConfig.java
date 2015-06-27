package com.wisely.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public CommandService commandService() {
        return new WindowsCommnadService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public CommandService linuxEmailerService() {
        return new LinuxCommandService();
    }

}