package com.zhujianbiao.injection;

import com.zhujianbiao.XxxAware.ApplicationContextAwareTest;
import com.zhujianbiao.dao.BookDao;
import com.zhujianbiao.lifecycle.Car;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 用来测试 自动注入注解（@Autowride，@Resource, @Qualifier）的配置类
 *
 * @Autowride 优先注入 用@primary注解修饰的组件
 *
 * @Resource是Java中JSR250规范里面定义的一个注解
 *
 *
 */
@Configuration
//@ComponentScan({"com.zhujianbiao.controller","com.zhujianbiao.service","com.zhujianbiao.dao"})
public class AutoInjectionConfigration {


    @Bean
    @Primary
    public BookDao bookDao2(){
        BookDao bookDao = new BookDao();
        bookDao.setBookPage(2);
        return bookDao;
    }

    @Bean
    public Boss boss(){
        return new Boss(new Car());
    }

    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public ApplicationContextAwareTest applicationContextAwareTest(){
        return new ApplicationContextAwareTest();
    }
}
