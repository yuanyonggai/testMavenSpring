package com.wisely.aop;

import org.springframework.stereotype.Service;

@Service
public class Demo1Service {
    @Action(name="demo1,add操作")
    public void add(){} //JoinPoint
    @Action(name="demo1,remove操作")
    public void remove(){}//JoinPoint
    @Action(name="demo1,update操作")
    public void update(){}//JoinPoint
    @Action(name="demo1,query操作")
    public void query(){}//JoinPoint

}