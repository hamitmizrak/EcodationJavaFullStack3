package com.hamitmizrak.business.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class RegisterDto {

    private Long id;

    @NotEmpty(message = "adı boş geçilemez")
    private String  name;

    @NotEmpty(message = "email boş geçilemez")
    @Email(message = "uygun formatta girmediniz örneğin: deneme@xyz.com")
    private String  email;

    @NotEmpty(message = "Şifre boş geçilemez")
    @Size(min=5,max=10,message = "kullanıcı şifresi 5 ile 10 arasında olması gerekiyor.")
    //@Pattern( regexp =  "^[a-zA-Z0-9]{5}")
    private String  password;

    //parametresiz constructor
    public RegisterDto() {
    }

    //parametreli constructor
    public RegisterDto(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
