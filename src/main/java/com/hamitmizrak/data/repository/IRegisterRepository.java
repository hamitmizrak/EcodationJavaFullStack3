package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.RegisterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRegisterRepository extends CrudRepository<RegisterEntity,Long> {

    List<RegisterEntity> findByName(String name);
    List<RegisterEntity> findDistinctByName(String name);
    List<RegisterEntity> findByNameStartsWith(String name);
    List<RegisterEntity> findByNameEndsWith(String name);
    List<RegisterEntity> findFirstByOrderById();
}
