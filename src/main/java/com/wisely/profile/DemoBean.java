package com.wisely.profile;


public class DemoBean {
    private String url;

    public DemoBean(String url) {
        super();
        this.url = url;
        System.out.println("地址为："+url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}