package com.hamitmizrak.oop.abstracx;

public class MainClass {
    public static void main(String[] args) {

        //Person nesneme özellikler verebiliriz.

        //poly + morphism
        Person person21 =new Student("öğrenci adı","öğrenci soyadı",10,"Viola");
        //polymorphism
        person21.fullName("student adı","student soyadı");
        person21.govdesizMethod("student1");
        System.out.println(person21.getName()+person21.getSurname()+person21.getNumber());
        System.out.println("**********************************************************");


        System.out.println("**** STUDENT 2 ******************************************************");
        Student student=new Student("öğrenci adı","öğrenci soyadı",10,"Viyolensel < Kontrabas");
        //polymorphism
        student.fullName("student adı","student soyadı");
        student.govdesizMethod("student2");
        System.out.println(student.getName()+student.getSurname()+student.getNumber());

        System.out.println("**** Teacher 1 ******************************************************");
        Teacher teacher=new Teacher("teacher adı","teacher soyadı",55);
        //polymorphism
        teacher.fullName("teacher adı","teacher soyadı");
        System.out.println(teacher.getName()+teacher.getSurname()+teacher.getNumber());
    }
}
