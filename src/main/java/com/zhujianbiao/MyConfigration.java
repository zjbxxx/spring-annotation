package com.zhujianbiao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//将指定包下添加了@Controller，@Service等注解的Bean添加到容器中
@ComponentScan(value = "com.zhujianbiao" ,
        /**
         * excludeFilters属性代表在包扫描中排除掉某些类，
         *      -type：指定是按照注解排除，还是按照给定的类型排除等，
         *          -  FilterType.ANNOTATION        按注解排除
         *          -  FilterType.ASSIGNABLE_TYPE   按给定的类型进行包含或者排除
         *          -  FilterType.ASPECTJ           按照ASPECTJ表达式进行包含或者排除
         *          -  FilterType.REGEX             按照正则表达式进行包含或者排除
         *          -  FilterType.CUSTOM            按照自定义规则进行包含或者排除
         *      classes：类型
         */
//        excludeFilters = {
//            @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
//        }
        includeFilters = {
            @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
        },useDefaultFilters = false
)
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
