package com.hamitmizrak.controller;

import com.hamitmizrak.dto.RegisterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@Log4j2
public class RegisterController {
    private static final String PATH = "C:\\0_Tutorials\\fileio\\form.txt";

    //Dosya YAZ
    private void writerDataFile(RegisterDto registerDto) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            bufferedWriter.write("["+ nowDate() +"] " + registerDto+"\n");
            bufferedWriter.flush();
            System.out.println("Dosya: " + PATH + " bu yola kaydedildi");
        } catch (Exception e) {

        }
    }

    private String nowDate() {
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss",locale);
        Date date=new Date();
        String dateString=format.format(date);
        return dateString;
    }

    //DOSYA OKU
    private void readerDataFile() {

    }


    // http://localhost:8080/validation/form
    @GetMapping("/validation/form")
    public String validationGetForm(Model model) {
        model.addAttribute("register_validation", new RegisterDto());
        return "thymeleaf6";
    }

    // http://localhost:8080/validation/form
    @PostMapping("/validation/form")
    public String validationPostForm(@Valid @ModelAttribute("register_validation") RegisterDto registerDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("Hata var" + bindingResult);
            return "thymeleaf6";
        } else {
            log.error("Kayıt Başarılı");
            //DATABASE
            //FILES
            writerDataFile(registerDto);
        }
        return "success";
    }
}
