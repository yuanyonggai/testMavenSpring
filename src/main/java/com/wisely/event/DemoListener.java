package com.wisely.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event) {
            String msg = ((DemoEvent) event).getMsg();
            System.out.println("我监听到了pulisher发布的message为:"+msg);

    }


}