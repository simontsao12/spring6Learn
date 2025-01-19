package com.atsimoncc.spring6.validator.two;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * ClassName: MyValidation1
 * Package: com.atsimoncc.spring6.validator.two
 * Description:
 */
@Service
public class MyValidation1 {
    // 使用原生的
    @Autowired
    private Validator validator;

    public boolean validatorByUserOne(User user) {
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        return validate.isEmpty();
    }
}
