package com.atsimoncc.spring6.iocxml.auto.service;

import com.atsimoncc.spring6.iocxml.auto.dao.UserDao;

/**
 * ClassName: UserServiceImpl
 * Package: com.atsimoncc.spring6.iocxml.auto.service
 * Description:
 */
public class UserServiceImpl implements UserService{

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("userService方法執行了");
        // 呼叫屬性 userDao 的方法
        userDao.addUserDao();
    }
}
