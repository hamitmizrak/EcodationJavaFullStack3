package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


//exclude:dahil etmemek
/*@SpringBootApplication(exclude = {
        //SecurityAutoConfiguration.class
        //org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
       // org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)*/
@SpringBootApplication
public class EcodationFullStack3Application {

    //PSVM Method
    public static void main(String[] args) {

        //devtool active inactive
        System.setProperty("spring.devtools.restart.enabled","true");

        //Disables headless JOptionPane
        System.setProperty("java.awt.headless", "false");

        //PSVM
        SpringApplication.run(EcodationFullStack3Application.class, args);
    }
}
