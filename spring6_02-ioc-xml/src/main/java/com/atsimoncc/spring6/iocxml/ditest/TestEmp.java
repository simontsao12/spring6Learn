package com.atsimoncc.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestEmp
 * Package: com.atsimoncc.spring6.iocxml.ditest
 * Description:
 */
public class TestEmp {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        Emp emp = (Emp) context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.work();
    }
}
