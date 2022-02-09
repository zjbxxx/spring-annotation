package com.zhujianbiao.aop;

import org.springframework.stereotype.Component;

@Component
public class MathCalculator {

    public int dev(int i, int j){
        System.out.println("MathCalculator.....dev.....");
        return i / j;
    }

}
