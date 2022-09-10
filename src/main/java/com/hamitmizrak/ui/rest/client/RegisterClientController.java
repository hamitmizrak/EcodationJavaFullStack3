package com.hamitmizrak.ui.rest.client;

import com.hamitmizrak.business.dto.RegisterDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import java.util.List;

//CLIENT
@Controller
public class RegisterClientController {

    //Api yazan şu sorulur ?
    //1-) URL
    //2-) Model
    //3-) Get Post Put Delete

    //LIST
    // http://localhost:8080/client/register/list
    @GetMapping("client/register/list")
    //@ResponseBody
    public String getClientAllData(Model model){
        String URL="http://localhost:8080/api/v1/list/register";
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<List<RegisterDto>> responseEntity=restTemplate.exchange(URL, HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<RegisterDto>>() {
        });
        List<RegisterDto> registerDtoList=responseEntity.getBody();
        registerDtoList.forEach((temp)->{System.out.println(temp);});
        model.addAttribute("register_client_list",responseEntity.getBody());
        return "registerClientList";
    }

    //FIND
    // http://localhost:8080/client/find/register/1
    @GetMapping( {"/client/find/register/{id}","/client/find/register" } )
    public String getClientFindById(@PathVariable(name="id",required = false) Long id, Model model){
        String URL="http://localhost:8080/api/v1/find/register/"+id;
        RestTemplate restTemplate=new RestTemplate();
        RegisterDto registerDto=restTemplate.getForObject(URL,RegisterDto.class);
        model.addAttribute("register_client_find",registerDto);
        return "registerClientDetailPage";
    }


    //DELETE
    // http://localhost:8080/client/delete/register/1
    @GetMapping( {"/client/delete/register/{id}","/client/delete/register" } )
    public String getClientDeleteById(@PathVariable(name="id",required = false) Long id, Model model){
        String URL="http://localhost:8080/api/v1/delete/register/"+id;
        RestTemplate restTemplate=new RestTemplate();
        RegisterDto registerDto=restTemplate.getForObject(URL,RegisterDto.class);
        model.addAttribute("register_client_delete",registerDto);
        return "redirect:/client/register/list";
    }

    //CREATE 2639 page


}
