package com.atsimoncc.spring6.aop.example;

/**
 * ClassName: CalculatorStaticProxy
 * Package: com.atsimoncc.spring6.aop.example
 * Description:
 */
public class CalculatorStaticProxy implements Calculator {

    // 被代理目標物件要傳進來
    private Calculator calculator;
    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("[日誌]add開始");

        // 呼叫目標物件的方法實現核心業務
        int result = calculator.add(a, b);

        System.out.println("[日誌]add結束");
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("[日誌]sub開始");

        // 呼叫目標物件的方法實現核心業務
        int result = calculator.sub(a, b);

        System.out.println("[日誌]sub結束");
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("[日誌]mul開始");

        // 呼叫目標物件的方法實現核心業務
        int result = calculator.mul(a, b);

        System.out.println("[日誌]nul結束");
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("[日誌]div開始");

        // 呼叫目標物件的方法實現核心業務
        int result = calculator.div(a, b);

        System.out.println("[日誌]div結束");
        return result;
    }
}
