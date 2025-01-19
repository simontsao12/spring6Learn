package com.atsimoncc.spring6.validator.one;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * ClassName: PersonValidator
 * Package: com.atsimoncc.spring6.validator.one
 * Description:
 */
public class PersonValidator implements Validator {
    // supports表示要用在哪個類型上
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }
    // 設定校驗邏輯的地方
    @Override
    public void validate(Object target, Errors errors) {
        // 判斷 name 不能為空
        ValidationUtils.rejectIfEmpty(errors,
                "name", "name.empty", "name is null");
        // age 不能小於 0 不大於 200
        Person person = (Person) target;
        if (person.getAge() < 0) {
            errors.rejectValue("age", "age.invalid", "age < 0");
        } else if (person.getAge() > 200) {
            errors.rejectValue("age", "age.invalid", "age > 200");
        }
    }
}
