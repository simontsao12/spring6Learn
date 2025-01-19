package com.atsimoncc.spring6.resource;

import com.atsimoncc.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUserController
 * Package: com.atsimoncc.spring6.autowired
 * Description:
 */
public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean("myUserController", UserController.class);
        userController.add();
    }
}
