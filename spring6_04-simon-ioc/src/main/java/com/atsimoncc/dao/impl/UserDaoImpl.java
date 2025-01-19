package com.atsimoncc.dao.impl;

import com.atsimoncc.anno.Bean;
import com.atsimoncc.dao.UserDao;

/**
 * ClassName: UserDaoImpl
 * Package: com.atsimoncc.dao.impl
 * Description:
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao...");
    }
}
