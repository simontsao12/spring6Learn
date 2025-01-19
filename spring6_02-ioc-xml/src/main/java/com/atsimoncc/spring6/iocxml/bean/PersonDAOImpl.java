package com.atsimoncc.spring6.iocxml.bean;

/**
 * ClassName: PersonDAOImpl
 * Package: com.atsimoncc.spring6.iocxml.bean
 * Description:
 */
public class PersonDAOImpl implements UserDAO{
    @Override
    public void run() {
        System.out.println("Person run");
    }
}
