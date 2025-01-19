package com.atsimoncc.spring6.iocxml.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * ClassName: MyBeanPost
 * Package: com.atsimoncc.spring6.iocxml.life
 * Description:
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3 bean後置處理器 初始化之前執行");
        System.out.println("beanName:" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 bean後置處理器 初始化之後執行");
        System.out.println("beanName:" + beanName);
        return bean;
    }
}
