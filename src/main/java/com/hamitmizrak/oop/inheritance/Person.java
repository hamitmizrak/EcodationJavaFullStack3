package com.hamitmizrak.oop.inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {

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

    public void fullName(String name, String surname) {
        System.out.println(name+" "+surname);
    }

}
