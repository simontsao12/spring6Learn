package com.atsimoncc.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * ClassName: ProxyFactory
 * Package: com.atsimoncc.spring6.aop.example
 * Description:
 */
public class ProxyFactory {

    // 目標對象
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回代理物件
    public Object getProxy() {
        /**
         * 有三個參數
         * 1 ClassLoader: 加載動態生成代理類的類加載器
         * 2 Class[] interfaces: 目標物件實現的所有介面的 Class 類型陣列
         * 3 InvocationHandler: 設置代理物件實現目標物件方法的過程
         */
        // 1
        ClassLoader classLoader = target.getClass().getClassLoader();
        // 2
        Class<?>[] interfaces = target.getClass().getInterfaces();
        // 3
        InvocationHandler invocationHandler = new InvocationHandler() {

            // 第一個參數: 代理物件
            // 第二個參數: 需要重寫目標物件的方法
            // 第三個參數: 方法中的參數
            @Override
            public Object invoke(Object proxy,
                                 Method method,
                                 Object[] args) throws Throwable {
                // 方法呼叫之前
                System.out.println("[動態代理][日誌] " + method.getName() + ", 參數: " + Arrays.toString(args));
                // 調用目標的方法
                Object result = method.invoke(target, args);
                // 方法呼叫之後
                System.out.println("[動態代理][日誌] " + method.getName() + ", 結果: " + result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
