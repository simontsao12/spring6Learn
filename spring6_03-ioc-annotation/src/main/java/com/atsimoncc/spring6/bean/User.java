package com.atsimoncc.spring6.bean;

import org.springframework.stereotype.Component;

/**
 * ClassName: User
 * Package: com.atsimoncc.spring6.bean
 * Description:
 */
@Component(value = "user") // <bean id="user" class="...">
// value 沒寫預設為類別名稱的首字母小寫
public class User {
}
