package com.atsimoncc.spring6.prefix;

import com.atsimoncc.spring6.di.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * ClassName: TestDemo
 * Package: com.atsimoncc.spring6.prefix
 * Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean*.xml");
        Resource resource = context.getResource("test2.txt");
        System.out.println(resource.getDescription());
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
