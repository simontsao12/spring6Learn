package com.atsimoncc.spring6.iocxml.bean;

/**
 * ClassName: UserDAOImpl
 * Package: com.atsimoncc.spring6.iocxml.bean
 * Description:
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void run() {
        System.out.println("run...");
    }
}
