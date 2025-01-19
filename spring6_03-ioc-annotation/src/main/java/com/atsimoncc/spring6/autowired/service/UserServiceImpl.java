package com.atsimoncc.spring6.autowired.service;

import com.atsimoncc.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.atsimoncc.spring6.autowired.service
 * Description:
 */
@Service
public class UserServiceImpl implements UserService{
    // 注入 Dao
    // 第一種方式 屬性注入
    // @Autowired // 根據類型找到對應的物件 完成注入
    // private UserDao userDao;

    // 第二種方式 set 注入
    // private UserDao userDao;
    // @Autowired
    // public void setUserDao(UserDao userDao) {
    //     this.userDao = userDao;
    // }

    // 第三種方式 建構子注入
    // private UserDao userDao;
    // @Autowired
    // public UserServiceImpl(UserDao userDao) {
    //     this.userDao = userDao;
    // }

    // 第四種方式 形參注入
    // private UserDao userDao;
    // public UserServiceImpl(@Autowired UserDao userDao) {
    //     this.userDao = userDao;
    // }

    // 第六種方式 兩個注解 根據名稱注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;


    @Override
    public void add() {
        System.out.println("service...");
        userDao.add();
    }
}
