package com.wisely.prepost;

public class BeanWayService {
    public void init(){
        System.out.println("init-method-bean");
    }
    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-bean");
    }
    public void destroy(){
        System.out.println("destory-method-bean");
    }

}