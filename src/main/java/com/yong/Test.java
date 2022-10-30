package com.yong;

import com.spring.YongApplicationContext;
import com.yong.service.UserService;

public class Test {
    public static void main(String[] args) {

        YongApplicationContext yongApplicationContext = new YongApplicationContext(AppConfig.class);
        UserService userService = (UserService)yongApplicationContext.getBean("userService");
    }
}
