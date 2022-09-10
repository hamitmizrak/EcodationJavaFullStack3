package com.hamitmizrak.ui.mvc;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SecurityController {

    //public (index)
    // http://localhost:8080/security/index
    @GetMapping("/security/index")
    public String getPublic() {
        return "publicPage";
    }

    //public (success)
    // http://localhost:8080/security/success
    @GetMapping("/security/success")
    public String getSuccess() {
        return "success";
    }

    //private (secret)
    // http://localhost:8080/security/private
    @GetMapping("/security/private")
    public String getPrivate() {
        return "privatePage";
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
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        //sistemde bir kulllanıcı varsa
        if(authentication!=null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
            model.addAttribute("logout_key","Çıkış Yapıldı");
        }else{
            model.addAttribute("logout_key","Sistemde kullanıcı yoktur");
        }
      return "logout";
    }
}
