package com.hamitmizrak.oop.inheritance;

import lombok.ToString;


public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, String surname, int number) {
        super(name, surname, number);
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }

    @Override
    public void fullName(String name, String surname) {
        System.out.println("TEACHER: "+name.toUpperCase().concat("TR")+" "+surname.toUpperCase().concat("TR"));
    }
}
