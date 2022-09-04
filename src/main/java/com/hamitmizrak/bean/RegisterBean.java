package com.hamitmizrak.bean;

import com.hamitmizrak.data.entity.RegisterEntity;
import com.hamitmizrak.data.repository.IRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterBean {

    @Autowired
    IRegisterRepository repository;

    @Bean
    public void registerData(){
        for (int i = 1; i <=5 ; i++) {
            RegisterEntity registerEntity=RegisterEntity.builder().name("adi "+i).email("email"+i+"@xyz.com").password("Hm12"+i). build();
            repository.save(registerEntity);
        }
    }
}
