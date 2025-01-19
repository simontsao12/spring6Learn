package com.atsimoncc.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * ClassName: TestUser
 * Package: com.atsimoncc.spring6
 * Description:
 */
public class TestUser {
    // 建立 Logger 物件
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        // 加載 spring 配置文件, 物件創建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 獲取創建的物件
        User user = (User)context.getBean("user");
        System.out.println("1:" + user);
        // 使用物件呼叫方法進行測試
        System.out.print("2:");
        user.add();
        // 手動寫日誌
        logger.info("### 執行呼叫logger info成功了..");
    }

    @Test
    public void testUserBean() throws Exception {
        Class clazz = Class.forName("com.atsimoncc.spring6.User");
        User user = (User)clazz.getDeclaredConstructor().newInstance();
        user.add();
    }
}
