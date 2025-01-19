package com.atsimoncc.spring6.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: LogAspect
 * Package: com.atsimoncc.spring6.aop.example.annoaop
 * Description:
 */
// 切面類
@Component // 在 ioc 容器中進行管理
public class LogAspect {
    // 前置通知
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知, 方法名稱: " + methodName + " , 參數: " + Arrays.toString(args));
    }
    // 後置通知
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->後置通知, 方法名稱: " + methodName);
    }
    // 返回通知 獲取目標方法返回值
    public void afterReturningMethod(JoinPoint joinPoint, Object result) { //result可以隨便取但注解與參數要一致
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->返回通知, 方法名稱: " + methodName + " , 返回結果: " + result);
    }
    // 異常通知
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->異常通知, 方法名稱: " + methodName + " , 異常訊息: " + ex);
    }
    // 環繞通知
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argStr = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("環繞通知: 目標方法之前執行");
            // 呼叫目標方法
            result = joinPoint.proceed();
            System.out.println("環繞通知: 目標方法返回值之後執行");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("環繞通知: 目標方法出現異常執行");
        } finally {
            System.out.println("環繞通知: 目標方法執行完畢執行");
        }
        return result;
    }
}
