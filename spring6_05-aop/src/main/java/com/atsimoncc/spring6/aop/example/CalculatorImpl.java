package com.atsimoncc.spring6.aop.example;

/**
 * ClassName: CalculatorImpl
 * Package: com.atsimoncc.spring6.aop.example
 * Description:
 */
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("方法內部 =" + result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result = a - b;
        System.out.println("方法內部 =" + result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result = a * b;
        System.out.println("方法內部 =" + result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result = a / b;
        System.out.println("方法內部 =" + result);
        return result;
    }
}
