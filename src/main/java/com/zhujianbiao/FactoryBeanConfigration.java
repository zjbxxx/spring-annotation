package com.zhujianbiao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FactoryBean 配置类
 */

@Configuration
public class FactoryBeanConfigration {


    /**
     * 此处代码中注入的是ColorFactoryBean类型的Bean，其实容器中真实的组件类型是ColorFactoryBean接口实现类中getObject()方法返回的对象
     * @return
     */
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

}
