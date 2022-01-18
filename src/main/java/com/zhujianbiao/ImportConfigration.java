package com.zhujianbiao;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
/**
 * @Import注解可以快速注入一个bean，只能添加到类上，id默认是组件的全类名，可以传入数组
 *
 *2.可以传入实现ImportSelector接口的类（批量注入）
 *3.ImportBeanDefinitionRegistrar方式注入bean
 *
 */
//@Import({Color.class, Yellow.class})
//@Import({MyImportSelector.class})
@Import(MyImportBeanDefinitionRegistrar.class)
public class ImportConfigration {


    @Bean
    public Person wangwu(){
        return new Person("wangwu",38);
    }

}
