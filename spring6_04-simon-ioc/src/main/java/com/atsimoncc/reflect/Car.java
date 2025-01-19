package com.atsimoncc.reflect;

/**
 * ClassName: Car
 * Package: com.atsimoncc.reflect
 * Description:
 */
public class Car {
    // 屬性
    private String name;
    private int age;
    private String color;

    // 建構子
    public Car() {
    }

    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    // 普通方法
    private void run() {
        System.out.println("私有方法 run...");
    }

    // get set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
