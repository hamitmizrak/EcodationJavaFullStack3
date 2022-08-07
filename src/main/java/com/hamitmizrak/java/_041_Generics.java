package com.hamitmizrak.java;

import lombok.*;
import lombok.extern.log4j.Log4j2;

//İçinde Bütün Referans Tipleri barındırır.
// Byte Short Integer Long Boolean Float Double Character Class
// <> ile gösterilir

@Log4j2
@Getter
@Setter
@Builder
public class _041_Generics <T> {

    //Object Variable
    private T data;

    //parametresiz constructor
    public _041_Generics() {
    }

    //parametreli constructor
    public _041_Generics(T data) {
        this.data = data;
    }
}

//PSVM
class GenericsMainClass {
    public static void main(String[] args) {
        _041_Generics generics=new _041_Generics("Merhabalar");
        System.out.println(generics.getData());
    }
}