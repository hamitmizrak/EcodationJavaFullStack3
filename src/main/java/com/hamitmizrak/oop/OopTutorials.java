package com.hamitmizrak.oop;


/*   Inheritance - Polymorohism -  Encapsulation - Abstraction(abstract+interface)   */
/* pojo < bean <managementBean<CDI */
public class OopTutorials {

    //Değişkeneler (ND)
    private String name;
    private  String surname;
    private  int number;

    //constructor(paremetreli -parametresiz)
   //parametresiz constructor
    //default değerler
    public  OopTutorials(){
        this.name="adı girillmedi";
        surname="soyadı girilmedi";
        this.number=44;
    }

    //parametreli constructor
    public OopTutorials(String name) {
        this.name = name;
    }

    public OopTutorials(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public OopTutorials(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public OopTutorials(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    @Override
    public String toString() {
        return "OopTutorials{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                '}';
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public OopTutorials setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public OopTutorials setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public OopTutorials setNumber(int number) {
        if(number<0)
        {
            System.out.println("Sıfırın altında veremezsiniz");
            number=number*(-1);
            this.number = number;
        }

        return this;
    }
}


class MainClass{
    public static void main(String[] args) {
        OopTutorials deneme=new OopTutorials("Hamit","Mızrak",44) ;
        System.out.println("Hash Code: "+deneme.hashCode());
        System.out.println(deneme);

        //instance of
        if(deneme instanceof OopTutorials) {
            System.out.println("Evet o classta türemiş");
        }else{
            System.out.println("Hayır o classta türemiş");
        }
        //null
        //new
        //sıfır
    }
}