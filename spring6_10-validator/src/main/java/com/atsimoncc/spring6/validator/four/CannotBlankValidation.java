package com.atsimoncc.spring6.validator.four;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * ClassName: CannotBlankValidation
 * Package: com.atsimoncc.spring6.validator.four
 * Description:
 */
public class CannotBlankValidation implements ConstraintValidator<CannotBlank, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null && value.contains(" ")) {
            // 獲取預設提示訊息
            String defaultConstraintMessageTemplate = context.getDefaultConstraintMessageTemplate();
            System.out.println("default message: " + defaultConstraintMessageTemplate);
            // 禁用預設提示訊息
            context.disableDefaultConstraintViolation();
            // 設定提示語
            context.buildConstraintViolationWithTemplate("can not contain spaces").addConstraintViolation();
            return false;
        }
        return false;
    }
}
