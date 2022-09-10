package com.hamitmizrak.ui.mvc;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;
import com.hamitmizrak.data.repository.IRegisterRepository;
import com.hamitmizrak.exception.ResourceNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Controller
@Log4j2
@Transactional
public class RegisterController {

   // @Autowired
    IRegisterRepository repository;

    //@Autowired
    ModelMapperBean modelMapperBean;

    //Constructor Field
    @Autowired
    public RegisterController(IRegisterRepository repository, ModelMapperBean modelMapperBean) {
        this.repository = repository;
        this.modelMapperBean = modelMapperBean;
    }

    //Class variable
    private static final String PATH = "C:\\0_Tutorials\\fileio\\form.txt";

    //Dosya YAZ
    private void writerDataFile(RegisterDto registerDto) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            bufferedWriter.write("[" + nowDate() + "] " + registerDto + "\n");
            bufferedWriter.flush();
            System.out.println("Dosya: " + PATH + " bu yola kaydedildi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String nowDate() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss", locale);
        Date date = new Date();
        String dateString = format.format(date);
        return dateString;
    }

    //DOSYA OKU
    private void readerDataFile() {
    }


    //Speed Data Create
    // http://localhost:8080/register/speed/data
    @GetMapping("register/speed/data")
    public String getAllData() {
        for (int i = 1; i <=10 ; i++) {
            RegisterEntity registerEntity=RegisterEntity.builder()
                    .name("adi "+i).email("email"+i+"@xyz.com").password("Hm12"+i)
                    . build();
            repository.save(registerEntity);
        }
        return "redirect:/list/register";
    }

    // CRUD
    //GET FORM
    // http://localhost:8080/create/register
    @GetMapping("/create/register")
    public String validationGetForm(Model model) {
        model.addAttribute("register_validation", new RegisterDto());
        return "registerApiCreate";
    }

    //POST FORM
    // http://localhost:8080/create/register
    @PostMapping("/create/register")
    public String validationPostForm(@Valid @ModelAttribute("register_validation") RegisterDto registerDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("Hata var" + bindingResult);
            return "registerApiCreate";
        } else {
            log.error("Kayıt Başarılı");
            //FILES
            writerDataFile(registerDto);
            //DATABASE
            RegisterEntity registerEntity = RegisterEntity.builder()
                    .name(registerDto.getName()).email(registerDto.getEmail()).password(registerDto.getPassword())
                    .build();
            repository.save(registerEntity);
        }
        //return "success";
        return "redirect:/list/register";
    }

    //LIST
    // http://localhost:8080/list/register
    @GetMapping("/list/register")
    //@ResponseBody
    public String getRegisterList(Model model) {
        Iterable<RegisterEntity> list = repository.findAll();
        model.addAttribute("register_list",list);
        list.forEach(temp -> {System.out.println(temp);});
        log.info(list);
        return "registerApiList";
    }

    //FIND
    // http://localhost:8080/find/register
    // http://localhost:8080/find/register/1
    @GetMapping( {"/find/register/{id}","/find/register" } )
    //@ResponseBody
    public String getRegisterFind(@PathVariable(name="id",required = false) Long id,Model model) {
        Optional<RegisterEntity>  findData=repository.findById(id);
        if(findData.isPresent()) {
            model.addAttribute("register_find",findData.get());
            return "registerApiDetailPage";
        }else{
            model.addAttribute("register_find",id+" numaralı id bulunamadı");
        }
        return "registerApiDetailPage";
    }

    //FIND
    // http://localhost:8080/find/hamit
    @GetMapping( "/find/{name}" )
    @ResponseBody
    public String getRegisterFindName(@PathVariable(name="name") String name) {
        List<RegisterEntity> findNameData=repository.findByName(name);
        //findNameData.forEach(temp -> {System.out.println(temp);});
        log.info(findNameData);
        return "Listem: " + findNameData;
    }

    //UPDATE  GET FORM
    // http://localhost:8080/update/register/1
    @GetMapping( "/update/register/{id}" )
    public String updateRegisterGetForm(@PathVariable(name="id") Long id,Model model){
        //1.YOL
       /*
       Optional<RegisterEntity>  findData=repository.findById(id);
        if(findData.isPresent()) {
            return "Data: "+findData.get();
        }else{
            return id+" numaralı Data: Bulunamadı  ";
        }
        */
        //2.YOL
        RegisterEntity registerEntityFind=   repository.findById(id).orElseThrow(()->new ResourceNotFoundException(id+" numaralı register bulunamadı"));
        if(registerEntityFind!=null){
            model.addAttribute("register_update",registerEntityFind);
            return "registerApiUpdate";
        }else{
            model.addAttribute("not_found",id+" numaralı veri bulunamadı");
        }
        return "registerApiList";
    }

    //UPDATE  POST FORM
    // http://localhost:8080/update/register/1
    @PostMapping( "/update/register/{id}" )
    public String updateRegisterPostForm(@PathVariable(name="id") Long id ,
                                         @Valid @ModelAttribute("register_update") RegisterDto registerDto,BindingResult bindingResult ){
        if(bindingResult.hasErrors()){
            log.error("HATA:"+bindingResult);
            return "registerApiUpdate";
        }
        RegisterEntity registerEntity=modelMapperBean.modelMapperMethod().map(registerDto,RegisterEntity.class);
        repository.save(registerEntity);
        return "redirect:/list/register";
    }

    //DELETE
    // http://localhost:8080/delete/register/1
    @GetMapping( "/delete/register/{id}" )
    public String deleteRegisterById(@PathVariable(name="id") Long id,Model model){
        RegisterEntity registerEntityFind=   repository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException(id+" numaralı register bulunamadı"));

        if(registerEntityFind!=null){
            //model.addAttribute("register_delete",registerEntityFind+" silindi");
            repository.deleteById(id);
        }else{
            model.addAttribute("not_found",id+" numaralı veri bulunamadı");
        }
        return "redirect:/list/register";
    }

}
