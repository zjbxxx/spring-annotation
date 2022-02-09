package com.zhujianbiao.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) {
//        int dev = MathCalculator.dev(10, 2);
//        MathCalculator mathCalculator = new MathCalculator();
//        int dev = mathCalculator.dev(10, 2);
//        System.out.println(dev);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfigcration.class);
        MathCalculator mathCalculator = context.getBean(MathCalculator.class);
        int dev = mathCalculator.dev(10, 0);
        System.out.println(dev);
    }

}
