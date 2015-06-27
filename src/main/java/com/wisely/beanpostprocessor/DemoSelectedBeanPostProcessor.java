package com.wisely.beanpostprocessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class DemoSelectedBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if(bean instanceof DemoSelectedService){
            ((DemoSelectedService) bean).setOs("Linux");
            System.out.println("在DemoSelectedBeanPostProcessor的"+"postProcessBeforeInitialization中将os从windows修改成了Linux" );
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if(bean instanceof DemoSelectedService){
            ((DemoSelectedService) bean).setNum(456L);
            System.out.println("在DemoSelectedBeanPostProcessor的"+"postProcessBeforeInitialization中将num从123修改成了456" );
        }
        return bean;
    }

}