package com.zhujianbiao.ValueAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value={"classpath:/person.properties","classpath:/bird.properties"})
@Configuration
public class ValueConfigration {


    @Bean
    public Person person(){
        return new Person();
    }

    @Bean
    public Bird bird(){
        return new Bird();
    }

}
