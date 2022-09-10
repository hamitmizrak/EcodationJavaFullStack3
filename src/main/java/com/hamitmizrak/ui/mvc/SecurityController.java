package com.hamitmizrak.ui.mvc;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SecurityController {
 // private Authentication authentication= SecurityContextHolder.getContext().getAuthentication();

    //public (index)
    // http://localhost:8080/security/index
    @GetMapping("/security/index")
    public String getPublic() {
        return "publicPage";
    }

    //public (success)
    // http://localhost:8080/success
    @GetMapping("/success")
    public String getSuccess() {
        return "success";
    }

    //private (secret Admin Page)
    // http://localhost:8080/admin
    @GetMapping("/admin")
    public String getPrivate(Model model) {
        //sistemdeki kullanıcıyı Admin sayfasına yönlendirdik
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        String user="";
        if(authentication!=null){
            user=authentication.getName();
        }
        model.addAttribute("user_key",user);
        return "admin";
    }

    // http://localhost:8080/user
    @GetMapping("/user")
    @ResponseBody
    public String getUser(){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        String user="";
        if(authentication!=null){
            user=authentication.getName();
        }
        return "Hoşgeldiniz:"+user;
    }

     //http://localhost:8080/login
    //http://localhost:8080/login?error
     @GetMapping("/login")
     public String getLogin(@RequestParam(value="error",required = false)String error, Model model) {
        //Eğer şifre veya kullanıcı adı yanlış girilirse
        if(error!=null)
            model.addAttribute("login_key","Kullanıcı adı veya şifreniz Yanlış");
        else//Sayfa açılır açılmaz
            model.addAttribute("login_key","Lütfen Bilgilerinizi Giriniz");
         return "login";
     }

    //http://localhost:8080/logout
    @GetMapping("/logout")
    public String getLogin(HttpServletRequest request, HttpServletResponse response, Model model) {

        //sistemde bir kulllanıcı varsa
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        if(authentication!=null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
            model.addAttribute("logout_key","Çıkış Yapıldı");
        }else{
            model.addAttribute("logout_key","Sistemde kullanıcı yoktur");
        }
      return "logout";
    }
}
