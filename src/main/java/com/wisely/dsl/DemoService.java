package com.wisely.dsl;

public class DemoService {
    private String msg;

    public String sayHello(){
        return "hello "+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}