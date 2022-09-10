package com.hamitmizrak.ui.rest.impl;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;
import com.hamitmizrak.data.repository.IRegisterRepository;
import com.hamitmizrak.exception.ResourceNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//API
@RestController
@RequestMapping("/api/v1")
@CrossOrigin
@Log4j2
//Dış dünyaya açılan kapıdır.
public class RegisterRestController {

    // @Autowired
    IRegisterRepository repository;

    //@Autowired
    ModelMapperBean modelMapperBean;

    //Constructor Field
    @Autowired
    public RegisterRestController(IRegisterRepository repository, ModelMapperBean modelMapperBean) {
        this.repository = repository;
        this.modelMapperBean = modelMapperBean;
    }

    // Speed Data Create
    // http://localhost:8080/api/v1/register/speed/data
    // import org.springframework.http.MediaType;
    // default: zaten json gelir
   // @GetMapping(value = "register/speed/data",produces = MediaType.APPLICATION_JSON_VALUE)
   // @GetMapping(value = "register/speed/data",produces = "application/json;charset=UTF-8")
    @GetMapping(value = "register/speed/data")
    public String getApiAllData() {
        int counter=0;
        for (int i = 1; i <=10 ; i++) {
            RegisterEntity registerEntity=RegisterEntity.builder()
                    .name("adi "+i).email("email"+i+"@xyz.com").password("Hm12"+i)
                    . build();
            repository.save(registerEntity);
            counter++;
        }
        return "register api "+counter+" veri eklendi";
    }

    //LIST
    // http://localhost:8080/api/v1/list/register
    @GetMapping("/list/register")
    //@ResponseBody
    public ResponseEntity<List<RegisterDto>> getApiRegisterList() {
        Iterable<RegisterEntity> entityList = repository.findAll();
        List<RegisterDto> dtoList=new ArrayList<>();
        RegisterDto dto = new RegisterDto();

        for( RegisterEntity entity   :entityList ){
            dto=modelMapperBean.modelMapperMethod().map(entity,RegisterDto.class);
            dtoList.add(dto);
        }
        return ResponseEntity.ok(dtoList) ;
    }


    //FIND
    // http://localhost:8080/api/v1/find/register
    // http://localhost:8080/api/v1/find/register/0
    // http://localhost:8080/api/v1/find/register/1
    @GetMapping( {"/find/register/{id}","/find/register/" } )
    //@ResponseBody
    public ResponseEntity<RegisterDto> getApiRegisterFind(@PathVariable(name="id",required = false) Long id) {
       Optional<RegisterEntity>  findData=repository.findById(id);
        if(id==null){
            log.error("404 ");
            return ResponseEntity.notFound().build();
        }
        else if(id==0){
            log.error("400 ");
            return ResponseEntity.badRequest().build();
        }
        RegisterDto registerDto=modelMapperBean.modelMapperMethod().map(findData.get(),RegisterDto.class);
        return ResponseEntity.ok(registerDto);
    }


    // DELETE
    // http://localhost:8080/api/v1/delete/register/1
    @DeleteMapping( "/delete/register/{id}" )
    public ResponseEntity<RegisterDto> deleteApiRegisterById(@PathVariable(name="id") Long id){
        RegisterEntity registerEntity=   repository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException(id+" numaralı register bulunamadı"));
        if(registerEntity!=null){
            repository.deleteById(id);
        }else{
            log.error(id+"ID YOKTUR");
        }
        RegisterDto registerDto=modelMapperBean.modelMapperMethod().map(registerEntity,RegisterDto.class);
        return ResponseEntity.ok(registerDto);
    }

    //CREATE
    // http://localhost:8080/api/v1/create/register
    @PostMapping("/create/register")
    public ResponseEntity<RegisterDto> apiCreateRegister(@RequestBody  RegisterDto registerDto){
        RegisterEntity registerEntity=modelMapperBean.modelMapperMethod().map(registerDto,RegisterEntity.class);
        repository.save(registerEntity);
        return ResponseEntity.ok(registerDto);
    }

    //UPDATE


}
