package com.atsimoncc.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: UserRedisDaoImpl
 * Package: com.atsimoncc.spring6.autowired.dao
 * Description:
 */
@Repository
public class UserRedisDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao redis...");
    }
}
