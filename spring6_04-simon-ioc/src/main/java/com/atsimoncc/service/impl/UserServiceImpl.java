package com.atsimoncc.service.impl;

import com.atsimoncc.anno.Bean;
import com.atsimoncc.anno.Di;
import com.atsimoncc.dao.UserDao;
import com.atsimoncc.service.UserService;

/**
 * ClassName: UserServiceImpl
 * Package: com.atsimoncc.service.impl
 * Description:
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service...");
        userDao.add();
    }
}
