package com.atsimoncc.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestBook
 * Package: com.atsimoncc.spring6.iocxml.di
 * Description:
 */
public class TestBook {
    @Test
    public void testSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book1 = (Book)context.getBean("book", Book.class);
        System.out.println(book1);
    }

    @Test
    public void testConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book2 = (Book)context.getBean("book2", Book.class);
        System.out.println(book2);
    }
}
