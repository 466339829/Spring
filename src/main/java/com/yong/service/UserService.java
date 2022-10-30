package com.yong.service;

import com.spring.Autowired;
import com.spring.BeanNameAware;
import com.spring.Component;

@Component
public class UserService implements UserInterface, BeanNameAware {

    @Autowired
    private OrderService orderService;
    private String beanName;
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void test() {
        System.out.println(beanName);
    }
}
