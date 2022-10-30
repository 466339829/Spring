package com.yong.service;

import com.spring.BeanPostProcessor;

import java.lang.reflect.Field;

public class YongValueBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        for (Field field:bean.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(YongValue.class)){
                field.setAccessible(true);
                try {
                    field.set(bean,field.getAnnotation(YongValue.class).value());
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return bean;
    }
}
