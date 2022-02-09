package com.zhujianbiao;

import com.zhujianbiao.BeanPostProcessor.BeanPostProcessorConfigration;
import com.zhujianbiao.ValueAnnotation.Bird;
import com.zhujianbiao.ValueAnnotation.ValueConfigration;
import com.zhujianbiao.XxxAware.ApplicationContextAwareTest;
import com.zhujianbiao.dao.BookDao;
import com.zhujianbiao.injection.AutoInjectionConfigration;
import com.zhujianbiao.lifecycle.LifecycleConfigration;
import com.zhujianbiao.service.BookService;
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


    /**
     * 生命周期测试
     */
    @Test
    public void testLifeCycle(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifecycleConfigration.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        context.close();
    }


    /**
     * BeanPostProcessor测试
     */
    @Test
    public void beanPostProcessortest测试(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanPostProcessorConfigration.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        context.close();
    }


    /**
     * @Value注解测试
     */
    @Test
    public void valueTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValueConfigration.class);
        com.zhujianbiao.ValueAnnotation.Person person = (com.zhujianbiao.ValueAnnotation.Person) context.getBean("person");
        Bird bird = (Bird) context.getBean("bird");
        System.out.println(person.toString());
        System.out.println(bird.toString());
        context.close();
    }

    /**
     *
     */
    @Test
    public void autoInjection(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoInjectionConfigration.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

//        BookService bean = context.getBean(BookService.class);
//        System.out.println(bean);

//        BookDao bean1 = context.getBean(BookDao.class);
//        System.out.println(bean1);

        Object boss = context.getBean(ApplicationContextAwareTest.class);
        System.out.println(boss);
    }

}
