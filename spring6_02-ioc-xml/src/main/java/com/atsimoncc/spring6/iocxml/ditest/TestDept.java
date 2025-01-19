package com.atsimoncc.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestDept
 * Package: com.atsimoncc.spring6.iocxml.ditest
 * Description:
 */
public class TestDept {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Dept dept = (Dept) context.getBean("dept", Dept.class);
        System.out.println(dept);
        dept.info();
    }
}
