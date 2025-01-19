package com.atsimoncc.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: UserRedisDaoImpl
 * Package: com.atsimoncc.spring6.autowired.dao
 * Description:
 */
@Repository("myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao redis...");
    }
}
