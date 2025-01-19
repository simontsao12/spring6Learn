package com.atsimoncc.spring6.validator.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.atsimoncc.spring6.validator.three
 * Description:
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService service = context.getBean(MyService.class);
        User user = new User();
        user.setName("lucy");
        user.setPhone("0982411382");
        user.setMessage("four package test");
        System.out.println(service.testMethod(user));

    }
}
