package com.zhujianbiao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(value = "com.zhujianbiao") //将指定包下添加了@Controller，@Service等注解的Bean添加到容器中
@Configuration //@Configuration注解标识某个类为配置类，同时此类会交给容器管理
public class MyConfigration {


    /**
     * @Bean注解的作用是把bean放到IOC容器里，bean的id默认为方法名，也可以手动指定name属性
     * @return
     */
    @Bean
    public Person zhangsan(){
        return new Person("zhangsan",18);
    }

    @Bean(name = "lisi001")
    public Person lisi(){
        return new Person("lisi",20);
    }

}
