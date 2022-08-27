package com.hamitmizrak.oop.abstracx;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
abstract public class Person {

    private String name;
    private String surname;
    private int number;


    public Person() {
    }

    public Person(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    //gövdeli method
    public void fullName(String name, String surname) {
        System.out.println(name+" "+surname);
    }

    //gövdesiz method
    abstract   public  void govdesizMethod(String data);

}
