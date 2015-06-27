package com.wisely.beanpostprocessor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoSelectedService {
    @Value("#{systemProperties['os.name']}")
    private String os;
    @Value("123")
    private Long num;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }


}