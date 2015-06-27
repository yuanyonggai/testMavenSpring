package com.wisely.propertyeditor;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class DemoBean0 {
    @Value("2014/02/03")
    private Date demoDate;

    public Date getDemoDate() {
        return demoDate;
    }

    public void setDemoDate(Date demoDate) {
        this.demoDate = demoDate;
    }


}