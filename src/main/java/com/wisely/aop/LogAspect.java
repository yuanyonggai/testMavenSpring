package com.wisely.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @After("@annotation(com.wisely.aop.Action)") //此处为pointcut
    public void after(JoinPoint joinPoint) {
        //每一个符合表达式条件的位置为joinPoint
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println(action.name());
        //获得操作内容后可插入数据库中
    }

    @Before("execution(* com.wisely.aop.Demo2Service.*(..))") //此处为pointcut
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("demo2,"+method.getName());

    }
}