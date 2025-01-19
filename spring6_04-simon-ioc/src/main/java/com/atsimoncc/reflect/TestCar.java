package com.atsimoncc.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: TestCar
 * Package: com.atsimoncc.reflect
 * Description:
 */
public class TestCar {
    // 1 獲取 Class 物件多種方式
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1 類名 .class
        Class clazz1 = Car.class;
        // 2 物件 .getClass()
        Class clazz2 = new Car().getClass();
        // 3 Class.forName("全路徑")
        Class clazz3 = Class.forName("com.atsimoncc.reflect.Car");
        // 實例化
        Car car = (Car)clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }
    // 2 獲取建構子
    @Test
    public void test02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Car.class;
        // 獲取全部的建構子
        // 針對 public 的
        // Constructor[] constructors = clazz.getConstructors();
        // for (Constructor constructor : constructors) {
        //     System.out.println("建構子名稱" + constructor.getName()+ "參數個數 " + constructor.getParameterCount());
        // }
        // 有宣告的都獲得
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println("建構子名稱" + constructor.getName()+ "參數個數 " + constructor.getParameterCount());
        }
        // 指定有參數建構子創建物件
        // 針對 public
        // Constructor constructor = clazz.getConstructor(String.class, int.class, String.class);
        // Car car1 = (Car)constructor.newInstance("夏曆", 10, "紅色");
        // System.out.println(car1);
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        declaredConstructor.setAccessible(true);
        Car car2 = (Car)declaredConstructor.newInstance("測試", 666, "顏色");
        System.out.println(car2);
    }
    // 3 獲取屬性
    @Test
    public void test03() throws Exception{
        Class clazz = Car.class;
        Car car = (Car)clazz.getDeclaredConstructor().newInstance();
        // 獲取 public
        Field[] fields = clazz.getFields();
        // 獲取全部
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("name")) {
            // 設置允許訪問
            declaredField.setAccessible(true);
            declaredField.set(car, "測測");
            }
        }
        System.out.println(car);
    }
    // 4 獲取方法
    @Test
    public void test04() throws Exception{
        Car car = new Car("奔馳", 10, "紅色");
        Class clazz = car.getClass();
        //public
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            // System.out.println(method.getName());
            // 執行
            if (method.getName().equals("toString")) {
                String invoke = (String)method.invoke(car);
                System.out.println("toString方法執行了:" + invoke);
            }
        }
        // private
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("run")) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(car);
            }
        }
    }
}
