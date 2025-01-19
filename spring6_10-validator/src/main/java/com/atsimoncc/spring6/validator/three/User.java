package com.atsimoncc.spring6.validator.three;

import com.atsimoncc.spring6.validator.four.CannotBlank;
import jakarta.validation.constraints.*;

/**
 * ClassName: User
 * Package: com.atsimoncc.spring6.validator.three
 * Description:
 */
public class User {

    // 自定義注解建立在套件 four
    @CannotBlank
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @NotNull
    private String name;

    @Min(0)
    @Max(150)
    private int age;

    @Pattern(regexp = "^09\\d{8}$", message = "手機號碼格是錯誤")
    @NotBlank(message = "手機號碼不可為空")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
