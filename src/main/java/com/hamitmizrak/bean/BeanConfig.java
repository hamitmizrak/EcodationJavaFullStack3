package com.hamitmizrak.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDto(){
        return BeanDto.builder().id(44L).beanData("Bean Data ").beanName("Bean Adı").  build();
    }
}
