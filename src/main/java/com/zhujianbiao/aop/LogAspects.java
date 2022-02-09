package com.zhujianbiao.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect//标识此类是一个切面类
public class LogAspects {

    /**
     * 如果切入点表达式都一样的情况下，那么我们可以抽取出一个公共的切入点表达式
     * 如果在本类中引用， 直接写此类的方法名加小括号，
     * 如果在其他类调用，需要写全类名
     */

    @Pointcut("execution(public int com.zhujianbiao.aop.MathCalculator.*(..))")
    public void pointCut() {}



    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        //目标方法的参数列表
        Object[] args = joinPoint.getArgs();
        //目标方法的方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "运行、、、、@Before，参数列表是：{" + Arrays.asList(args) +"}");
    }


    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法结束、、、、@After");
    }

    // 在目标方法（即div方法）正常返回了，有返回值时被调用
    @AfterReturning(pointcut = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法正常返回......@AfterReturning，运行结果是：{"+ result +"}");
    }

    //目标方法抛出异常时会调用
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法出现异常......异常信息：{" + exception +"}");
    }

}
