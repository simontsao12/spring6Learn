package com.atsimoncc.spring6.junit.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName: SpringTestJunit5
 * Package: com.atsimoncc.spring6.junit.junit5
 * Description:
 */
// 第一種方式(通常用此方式)
// @SpringJUnitConfig(locations = "classpath:bean.xml")
// 第二種方式需要兩個注解
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:bean.xml")
public class SpringTestJunit5 {

    // 注入
    @Autowired
    private User user;

    // 測試方法
    @Test
    public void testUser() {
        System.out.println(user);
        user.run();
    }

}
