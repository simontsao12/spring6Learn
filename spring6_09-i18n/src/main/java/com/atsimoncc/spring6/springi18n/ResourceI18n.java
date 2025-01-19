package com.atsimoncc.spring6.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ClassName: ResourceI18n
 * Package: com.atsimoncc.spring6.javai18n
 * Description:
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs = {"simon", new Date().toString()};
        String value = context.getMessage("key", objs, Locale.TAIWAN);
        System.out.println(value);
    }
}
