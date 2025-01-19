package com.atsimoncc.spring6.aop.example;

/**
 * ClassName: CalculatorLogImpl
 * Package: com.atsimoncc.spring6.aop.example
 * Description:
 */
public class CalculatorLogImpl implements Calculator{
    @Override
    public int add(int a, int b) {
        System.out.println("[日誌]add開始");
        int result = a + b;
        System.out.println("方法內部 =" + result);
        System.out.println("[日誌]add結束");
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("[日誌]sub開始");
        int result = a - b;
        System.out.println("方法內部 =" + result);
        System.out.println("[日誌]sub結束");
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("[日誌]mul開始");
        int result = a * b;
        System.out.println("方法內部 =" + result);
        System.out.println("[日誌]nul結束");
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("[日誌]div開始");
        int result = a / b;
        System.out.println("方法內部 =" + result);
        System.out.println("[日誌]div結束");
        return result;
    }
}
