package com.yong.service;

import com.spring.BeanNameAware;
import com.spring.Component;

@Component
public class UserService implements UserInterface, BeanNameAware {

    private String beanName;
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
