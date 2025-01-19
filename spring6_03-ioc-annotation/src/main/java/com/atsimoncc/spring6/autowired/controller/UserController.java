package com.atsimoncc.spring6.autowired.controller;

import com.atsimoncc.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Package: com.atsimoncc.spring6.autowired.controller
 * Description:
 */
@Controller
public class UserController {
    // 注入 Service
    // 第一種方式 屬性注入
    // @Autowired // 不需要寫 set 方法 根據類型找到對應的物件 完成注入
    // private UserService userService;

    // 第二種方式 set 方法注入
    // private UserService userService;
    // @Autowired
    // public void setUserService(UserService userService) {
    //     this.userService = userService;
    // }

    // 第三種方式 建構子注入
    // private UserService userService;
    // @Autowired
    // public UserController(UserService userService) {
    //     this.userService = userService;
    // }

    // 第四種方式 形參注入
    // private UserService userService;
    // public UserController(@Autowired UserService userService) {
    //     this.userService = userService;
    // }

    // 第五種方式 只有一個有參數建構子 無注解
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}
