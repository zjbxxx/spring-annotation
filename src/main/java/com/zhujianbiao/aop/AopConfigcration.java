package com.zhujianbiao.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfigcration {

    //将目标类加入到容器中
    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }


    // 将切面类加入到容器中
    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }

}
