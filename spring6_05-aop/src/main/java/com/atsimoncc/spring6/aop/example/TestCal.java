package com.atsimoncc.spring6.aop.example;

/**
 * ClassName: TestCal
 * Package: com.atsimoncc.spring6.aop.example
 * Description:
 */
public class TestCal {
    public static void main(String[] args) {
        // 建立代理物件(動態)
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy= (Calculator)proxyFactory.getProxy();
        proxy.add(1, 2);
        proxy.mul(2, 4);
    }
}
