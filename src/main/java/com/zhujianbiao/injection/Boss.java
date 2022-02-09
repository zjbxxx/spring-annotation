package com.zhujianbiao.injection;

import com.zhujianbiao.lifecycle.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {

    private Car car;

    public Car getCar() {
        return car;
    }

//    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }


    @Autowired
    public Boss(Car car) {
        this.car = car;
    }

    public Boss() {
    }
}
