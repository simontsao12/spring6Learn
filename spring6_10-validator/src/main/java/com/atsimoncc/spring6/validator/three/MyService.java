package com.atsimoncc.spring6.validator.three;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * ClassName: MyService
 * Package: com.atsimoncc.spring6.validator.three
 * Description:
 */
@Service
@Validated // 表示基於方法進行驗證
public class MyService {

    public String testMethod(@NotNull @Valid User user) {
        return user.toString();
    }
}
