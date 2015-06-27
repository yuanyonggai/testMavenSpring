package com.wisely.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
@Component
public class DemoBean implements BeanNameAware,ResourceLoaderAware{
    private String name;
    private ResourceLoader loader;

    //BeanNameAware接口的方法
    public void setBeanName(String beanName) {
        this.name = beanName;

    }

    //ResourceLoaderAware接口的的方法
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;

    }

    public String getName() {
        return name;
    }


    public ResourceLoader getLoader() {
        return loader;
    }

}