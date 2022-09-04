package com.hamitmizrak.ui.mvc;


import com.hamitmizrak.bean.BeanConfig;
import com.hamitmizrak.bean.BeanDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    //@Autowired
    BeanConfig beanConfig;

    @Autowired
    public BeanController(BeanConfig beanConfig) {
        this.beanConfig = beanConfig;
    }

    // http://localhost:8080/bean/beandto
    @GetMapping("bean/beandto")
    @ResponseBody
    public BeanDto getBeanDto() {
        return beanConfig.beanDto();
    }




}
