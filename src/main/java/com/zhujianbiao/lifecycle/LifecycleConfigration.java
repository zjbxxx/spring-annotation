package com.zhujianbiao.lifecycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LifecycleConfigration {


    /**
     * initMethod属性可以指定自定义的初始化方法，destroyMethod属性：销毁方法，单实例的销毁方法会在容器关闭时执行
     * 多实例对象在容器关闭时不会去调用销毁方法
     *
     * @return
     */
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

}
