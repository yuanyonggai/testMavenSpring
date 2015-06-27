package com.wisely.propertyeditor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class DemoBean {

    @Value("汪云飞-合肥")
    private DemoBean2 demoBean2;


    public DemoBean2 getDemoBean2() {
        return demoBean2;
    }

    public void setDemoBean2(DemoBean2 demoBean2) {
        this.demoBean2 = demoBean2;
    }

}