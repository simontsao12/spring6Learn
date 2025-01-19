package com.atsimoncc.spring6.iocxml.life;

/**
 * ClassName: User
 * Package: com.atsimoncc.spring6.iocxml.life
 * Description:
 */
public class User {
    private String name;

    public User() {
        System.out.println("1 調用無參建構子建立物件");
    }
    // 初始化的方法
    public void initMethod() {
        System.out.println("4 調用指定的初始化方法初始化bean物件");
    }

    // 銷毀的方法
    public  void destroyMethod() {
        System.out.println("7 調用指定的銷毀方法銷毀bean物件");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2 給bean物件設置屬性值");
        this.name = name;
    }
}
