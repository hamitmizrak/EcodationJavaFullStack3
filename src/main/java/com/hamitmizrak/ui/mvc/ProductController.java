package com.hamitmizrak.ui.mvc;
import com.hamitmizrak.business.dto.ProductDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
@Log4j2
@Transactional
public class ProductController {



    //FORM GET
    // http://localhost:8080/mvc1
    @GetMapping("mvc1")
    public String getThymeleaf1(Model model){
        ProductDto productDto=ProductDto.builder().id(55L).productName("Ürün adı").productPrice(500).   build();
       model.addAttribute("controller_key",productDto);
        return  "thymeleaf1";
    }

    //FORM POST
    // http://localhost:8080/mvc2
    @GetMapping("mvc2")
    //@ResponseBody
    public String getThymeleaf2(Model model){
        List<ProductDto> productDtoList=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ProductDto productDto=ProductDto.builder().id(Long.valueOf(i)).productName("Ürün adı "+i).productPrice(i*100).   build();
            productDtoList.add(productDto);
        }
        model.addAttribute("controller_list",productDtoList);
        log.info(productDtoList);
        return "thymeleaf2";
    }


    //@PathVariable
    // http://localhost:8080/mvc3
    // http://localhost:8080/mvc3/44
    // http://localhost:8080/mvc3/44/bilgisayar
    @GetMapping({"mvc3","mvc3/{id}","mvc3/{id}/{product_name}"})
    //@ResponseBody
    public String getThymeleaf3(
            @PathVariable(value = "id",required = false) Long productId,
            @PathVariable(value = "product_name",required = false) String productName,
            Model model){
        ProductDto productDto=ProductDto.builder().id(productId).productName(productName).productPrice(400).  build();
        if(productId==null){
            model.addAttribute("controller_key","Not Found");
        }else if(productId==0){
            model.addAttribute("controller_key","Bad Request");
        }else{
            model.addAttribute("controller_key",productDto);
        }
        return "thymeleaf3";
    }


    //@RequestParam
    // http://localhost:8080/mvc4?id=55&&product=bilgisayar
    // http://localhost:8080/mvc4?product=bilgisayar
    @GetMapping("mvc4")
    public String getThymeleaf4(
            @RequestParam(name = "id",required = false,defaultValue = "1") Long id,
            @RequestParam(name = "product") String  product,
            Model model){
        ProductDto productDto=ProductDto.builder().id(id).productName(product).productPrice(400).  build();
        model.addAttribute("controller_key",productDto);
        return "thymeleaf4";
    }

    //@RequestParam
    // http://localhost:8080/mvc5/44?product=bilgisayar
    @GetMapping("mvc5/{id}")
    public String getThymeleaf5(
            @PathVariable(name = "id") Long id,
            @RequestParam(name = "product") String  product,
            Model model){
        ProductDto productDto=ProductDto.builder().id(id).productName(product).productPrice(400).  build();
        model.addAttribute("controller_key",productDto);
        return "thymeleaf5";
    }


}
