package com.atsimoncc.spring6.resource.controller;

import com.atsimoncc.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Package: com.atsimoncc.spring6.autowired.controller
 * Description:
 */
@Controller("myUserController")
public class UserController {

    // 根據名稱進行注入
    // @Resource(name = "myUserService")
    // private UserService userService;

    // 根據類型進行注入
    @Resource
    private UserService userService;

    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}
