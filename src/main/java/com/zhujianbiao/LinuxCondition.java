package com.zhujianbiao;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**
 * 此类用来测试 @Conditional注解的注入条件判断
 * 当返回true时，则符合条件，则注入到容器，反之则不注入
 */
public class LinuxCondition implements Condition {
    /**
     * Determine if the condition matches.
     *
     * @param context  the condition context   上下文环境
     * @param metadata metadata of the {@link AnnotationMetadata class}   当前标注了@Conditional注解的注释信息
     *                 or {@link MethodMetadata method} being checked.
     * @return {@code true} if the condition matches and the component can be registered
     * or {@code false} to veto registration.
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        //获取当前环境信息，它里面就封装了我们这个当前运行时的一些信息，包括环境变量，以及包括虚拟机的一些变量
        Environment environment = context.getEnvironment();


        String property = environment.getProperty("os.name");
        System.out.println("当前的操作系统为：" + property);

        if(property.contains("Linux")){
            return true;
        }
        return false;
    }
}
