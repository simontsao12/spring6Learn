package com.atsimoncc.spring6.aop.annoaop;

import org.springframework.stereotype.Component;

/**
 * ClassName: CalculatorImpl
 * Package: com.atsimoncc.spring6.aop.example
 * Description:
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("方法內部 = " + result);
        // 為了測試 模擬異常
        // int t = 1 / 0;
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result = a - b;
        System.out.println("方法內部 = " + result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result = a * b;
        System.out.println("方法內部 = " + result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result = a / b;
        System.out.println("方法內部 = " + result);
        return result;
    }
}
