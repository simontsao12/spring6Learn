package com.atsimoncc.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.atsimoncc.spring6.iocxml
 * Description:
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 1 根據 id 獲取 bean
        User user1 = (User) context.getBean("user");
        System.out.println("根據id獲取User1: " + user1);
        // 2 根據類型獲取 bean(xml 有配置兩個不同 id 同類型的 bean)
        // User user2 = (User) context.getBean(User.class);
        // System.out.println("根據類型獲取User2: " + user2);
        // 3 根據 id 和類型獲取 bean
        User user3 = (User) context.getBean("user", User.class);
        System.out.println("根據類型獲取User3: " + user3);
    }
}
