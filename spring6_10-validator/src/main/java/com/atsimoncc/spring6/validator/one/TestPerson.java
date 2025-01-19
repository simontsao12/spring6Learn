package com.atsimoncc.spring6.validator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * ClassName: TestPerson
 * Package: com.atsimoncc.spring6.validator.one
 * Description:
 */
// 校驗測試
public class TestPerson {
    public static void main(String[] args) {
        // 建立 Person 物件
        Person person = new Person();
        person.setName("lucy");
        person.setAge(220);
        // 建立 person 對應 databinder
        DataBinder binder = new DataBinder(person);
        // 設定校驗器
        binder.setValidator(new PersonValidator());
        // 呼叫方法執行校驗
        binder.validate();
        // 輸出校驗結果
        BindingResult result = binder.getBindingResult();
        System.out.println(result.getAllErrors());
    }
}
