package com.atsimoncc.spring6.resource;

import com.atsimoncc.spring6.config.SpringConfig;
import com.atsimoncc.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUserController
 * Package: com.atsimoncc.spring6.autowired
 * Description:
 */
public class TestUserControllerAnno {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 加載配置類
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("myUserController", UserController.class);
        userController.add();
    }
}
