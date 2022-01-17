package com.zhujianbiao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;


/**
 * 用来测试 @Conditional 条件注解的配置类
 *
 * @Conditional注解可以实现按条件向容器中注入bean，符合条件则注入，反之则不注入
 * 使用场景：
 *      1）可以作为类级别的注解直接或者间接的与@component相关联，包括@Configuration
 *      2）可以作为元注解，用于自动编写构造性注解
 *      3）作为方法级别的注解，作用在任何@Bean方法上
 *
 */

@Configuration
public class ConditionalConfigration {

    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    @Conditional(WindowsCondition.class)
    public Person bill(){
        return new Person("bill",50);
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public Person linus(){
        return new Person("linus",50);
    }

}
