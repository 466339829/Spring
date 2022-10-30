package com.yong;

import com.spring.YongApplicationContext;
import com.yong.service.UserInterface;
import com.yong.service.UserService;

public class Test {
    public static void main(String[] args) {

        YongApplicationContext yongApplicationContext = new YongApplicationContext(AppConfig.class);
        UserInterface userService = (UserInterface)yongApplicationContext.getBean("userService");
        userService.test();
    }
}
