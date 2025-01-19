package com.atsimoncc.spring6.iocxml.auto.dao;

/**
 * ClassName: UserDaoImpl
 * Package: com.atsimoncc.spring6.iocxml.auto.dao
 * Description:
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("userDao方法執行了");
    }
}
