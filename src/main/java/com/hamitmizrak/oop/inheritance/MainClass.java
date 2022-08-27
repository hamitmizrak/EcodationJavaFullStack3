package com.hamitmizrak.oop.inheritance;

public class MainClass {
    public static void main(String[] args) {

        //Person nesneme özellikler verebiliriz.
        System.out.println("**** PERSON ******************************************************");
        Person person = new Person("person adı","person soyadı",10);
        System.out.println(person.getName()+person.getSurname()+person.getNumber());

        System.out.println("**** STUDENT 1 ******************************************************");
        //poly + morphism
        Person person2 =new Student("öğrenci adı","öğrenci soyadı",10,"Viola");
        //polymorphism
        person2.fullName("student adı","student soyadı");
        System.out.println(person2.getName()+person2.getSurname()+person2.getNumber());
        System.out.println("**********************************************************");


        System.out.println("**** STUDENT 2 ******************************************************");
        Student student=new Student("öğrenci adı","öğrenci soyadı",10,"Viyolensel < Kontrabas");
        //polymorphism
        student.fullName("student adı","student soyadı");
        System.out.println(student.getName()+student.getSurname()+student.getNumber());

        System.out.println("**** Teacher 1 ******************************************************");
        Teacher teacher=new Teacher("teacher adı","teacher soyadı",55);
        //polymorphism
        teacher.fullName("teacher adı","teacher soyadı");
        System.out.println(teacher.getName()+teacher.getSurname()+teacher.getNumber());
    }
}
