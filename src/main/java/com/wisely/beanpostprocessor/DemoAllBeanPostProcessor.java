package com.wisely.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class DemoAllBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out
				.println("在 DemoAllBeanPostProcessor的postProcessBeforeInitialization方法里处理bean: "
						+ beanName + " bean的类型为:" + bean.getClass());
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out
				.println("在 DemoAllBeanPostProcessor的 postProcessAfterInitialization方法里处理bean: "
						+ beanName + " bean的类型为:" + bean.getClass());
		return bean;
	}

}