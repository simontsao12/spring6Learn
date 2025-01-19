package com.atsimoncc.spring6.iocxml.auto.controller;

import com.atsimoncc.spring6.iocxml.auto.service.UserService;
import com.atsimoncc.spring6.iocxml.auto.service.UserServiceImpl;

/**
 * ClassName: UserController
 * Package: com.atsimoncc.spring6.iocxml.auto
 * Description:
 */
public class UserController {
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("userController方法執行了");
        // 呼叫屬性 userService 的方法
        userService.addUserService();
    }
}
