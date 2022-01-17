package com.zhujianbiao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * 此配置类用于测试@scope注解
 *
 * spring中组件的作用域默认是单例的，也就是每次从容器中取的都是同一个对象，如果需要改变组件的作用域，就需要用@scope注解
 *
 * 	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE   多例
 * 	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON   单例
 * 	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
 * 	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
 *
 *
 * 	 1.单例作用域的组件会在容器创建的时候一起被创建
 * 	 2.多实例作用域的组件会在调用时创建（懒加载）
 * 	 3.如果想让单例作用域的组件也实现懒加载，可以加@Lazy注解
 *
 *
 *
 */
@Configuration //@Configuration注解标识某个类为配置类，同时此类会交给容器管理
public class ScopeConfigration {

    @Lazy
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public Person person(){
        return new Person("zhujianbiao",18);
    }


}
