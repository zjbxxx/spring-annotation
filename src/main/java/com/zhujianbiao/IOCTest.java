package com.zhujianbiao;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Condition;


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

    @Test
    public void test3(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfigration.class);

        //获取容器中所有的bean名称
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println("=========");
//        Person person2 = (Person) applicationContext.getBean("person");
        //单例模式下，无论获取多少次，得到的都是统一对象
//        System.out.println(person == person2);
    }

    @Test
    public void test4(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalConfigration.class);

        //获取容器中所有的bean名称
        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }


    /**
     * 测试@Import注解
     */
    @Test
    public void testImport(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfigration.class);
        //获取容器中所有的bean名称
        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }


    /**
     * 测试FactoryBean方式注入Bean
     */
    @Test
    public void testFactoryBean(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfigration.class);
        //获取容器中所有的bean名称
        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        // String FACTORY_BEAN_PREFIX = "&";  BeanFactory接口中有此常量，所以想要获取工厂bean本身对象的话，只需要加上&前缀即可

        System.out.println(applicationContext.getBean("&colorFactoryBean"));
    }

}
