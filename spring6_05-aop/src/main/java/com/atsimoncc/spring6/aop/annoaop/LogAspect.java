package com.atsimoncc.spring6.aop.annoaop;

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
@Aspect // 表示為切面類
@Component // 在 ioc 容器中進行管理
public class LogAspect {

    // 設置切入點和通知類型
    // 切入點表達式: execution(訪問修飾符 增強方法返回類型 增強方法所在類型的全路徑 方法名(參數列表))
    // 通知類型:
    // 前置 @Before(value = "切入點表達式配置切入點")
    // @Before(value = "execution(public int com.atsimoncc.spring6.aop.annoaop.CalculatorImpl.*(..))")
    @Before(value = "execution(* com.atsimoncc.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {

        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知, 方法名稱: " + methodName + " , 參數: " + Arrays.toString(args));
    }
    // 後置 @After() 執行順序有點像 finally
    // @After(value = "execution(* com.atsimoncc.spring6.aop.annoaop.CalculatorImpl.*(..))")
    // 重用切入點表達式
    // 同切面
    // @After(value = "pointCut()")
    // 不同切面
    @After(value = "com.atsimoncc.spring6.aop.annoaop.LogAspect.pointCut()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->後置通知, 方法名稱: " + methodName);
    }
    // 返回 @AfterReturning
    @AfterReturning(value = "execution(* com.atsimoncc.spring6.aop.annoaop.CalculatorImpl.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) { // result 可以隨便取但注解與參數要一致
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->返回通知, 方法名稱: " + methodName + " , 返回結果: " + result);
    }

    // 異常 @AfterThrowing 獲取到目標方法異常訊息
    // 目標方法出現異常 這個通知會執行
    @AfterThrowing(value = "execution(* com.atsimoncc.spring6.aop.annoaop.CalculatorImpl.*(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->異常通知, 方法名稱: " + methodName + " , 異常訊息: " + ex);
    }
    // 環繞 @Around() 使用子介面 ProceedingJoinPoint 可以呼叫目標方法
    @Around(value = "execution(* com.atsimoncc.spring6.aop.annoaop.CalculatorImpl.*(..))")
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

    // 重用切入點表達式
    @Pointcut(value = "execution(* com.atsimoncc.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointCut() {}
}
