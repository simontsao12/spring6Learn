package com.atsimoncc.spring6.iocxml.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.atsimoncc.spring6.iocxml.life
 * Description:
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6 bean物件建立完成可以使用");
        System.out.println(user);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
