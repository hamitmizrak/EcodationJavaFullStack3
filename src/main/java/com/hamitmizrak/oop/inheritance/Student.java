package com.hamitmizrak.oop.inheritance;

public class Student  extends Person  {
    private String music;

    public Student() {
        music="Violin";
    }

    public Student(String name, String surname, int number, String music) {
        super(name, surname, number);
        this.music = music;
    }

    @Override
    public String toString() {
        return "Student {} " + super.toString();
    }

    @Override
    public void fullName(String name, String surname) {
        System.out.println("STUDENT: "+name.toUpperCase()+" "+surname.toUpperCase()+" "+music);
    }
}
