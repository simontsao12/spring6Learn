package com.atsimoncc.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUserDAO
 * Package: com.atsimoncc.spring6.iocxml.bean
 * Description:
 */
public class TestUserDAO {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 根據類型獲得介面對應 bean(有多個實現類會出錯)
        UserDAO userDAO = (UserDAO) context.getBean(UserDAO.class);
        System.out.println(userDAO);
        userDAO.run();
    }
}
