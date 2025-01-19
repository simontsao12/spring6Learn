package com.atsimoncc.spring6.resource.service;

import com.atsimoncc.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.atsimoncc.spring6.autowired.service
 * Description:
 */
@Service("myUserService")
public class UserServiceImpl implements UserService {

    // 不指定名稱 根據屬性名稱進行注入
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("service...");
        myUserDao.add();
    }
}
