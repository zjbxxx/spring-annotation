package com.zhujianbiao.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {

    /**
     * 对象创建完成并且属性赋值之后调用
     */
    @PostConstruct
    public void init(){
        System.out.println("初始化方法。。。");
    }

    /**
     * 在容器销毁（移除）对象之前调用
     */
    @PreDestroy
    public void destory(){
        System.out.println("销毁。。。。");
    }

}
