package com.hamitmizrak.security;

import com.hamitmizrak.bean.PasswordEncoderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityProject extends WebSecurityConfigurerAdapter {

    //Configure
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        ////Form Ekranı geliyor
        //http.authorizeRequests().anyRequest().authenticated().and().formLogin();

        //Http düzleminde geliyor
        // http.authorizeRequests().anyRequest().authenticated().and().httpBasic();

        //ilgili sayfalara yetkilendirme yapacam
        http.authorizeRequests()
                .antMatchers("/","/index","/login").permitAll()
                .antMatchers("/security/index","/security/success").permitAll()
                .anyRequest().authenticated().and().formLogin();
    }

    //@Autowired
    PasswordEncoderBean passwordEncoderBean;

    @Autowired
    public SecurityProject(PasswordEncoderBean passwordEncoderBean) {
        this.passwordEncoderBean = passwordEncoderBean;
    }

    @Autowired
    public void myUserPasswordRoles(AuthenticationManagerBuilder managerBuilder) throws Exception {
        //maskelemeden şifreleme
        //managerBuilder.inMemoryAuthentication().withUser("root").password("{noop}root").roles("ADMIN");

        //maskeleme yaparak şifreleme
        //PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
       //managerBuilder.inMemoryAuthentication().withUser("root").password(passwordEncoder.encode("root")).roles("ADMIN");

        managerBuilder.inMemoryAuthentication()
                .withUser("root")
                .password(passwordEncoderBean.passwordEncoderMethod()
                        .encode("root"))
                .roles("ADMIN");

    }
}
