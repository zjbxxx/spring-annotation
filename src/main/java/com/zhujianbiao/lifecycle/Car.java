package com.zhujianbiao.lifecycle;


import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car() {
        System.out.println("Car Constructor......");
    }

    public void init(){
        System.out.println("Car init.......");
    }

    public void destroy(){
        System.out.println("Car destroy.......");
    }

}
