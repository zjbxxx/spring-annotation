package com.zhujianbiao;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class IOCTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigration.class);

        //获取容器中Person类的所有Bean名称
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigration.class);

        //获取容器中所有的bean名称
        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }

}
