package com.atsimoncc.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName: MyFactoryBean
 * Package: com.atsimoncc.spring6.iocxml.factorybean
 * Description:
 */
public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

}
