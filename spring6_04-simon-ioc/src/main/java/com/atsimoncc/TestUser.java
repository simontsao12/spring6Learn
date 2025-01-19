package com.atsimoncc;

import com.atsimoncc.bean.AnnotationApplicationContext;
import com.atsimoncc.bean.ApplicationContext;
import com.atsimoncc.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.atsimoncc
 * Description:
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("com.atsimoncc");
        UserService userService= (UserService)context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
