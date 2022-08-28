package com.hamitmizrak.desinpattern.creational;

public class _2_Builder {
    //Creation Design Pattern 2.
    //Parametreli constructor aza indirmek için kullanıyoruz
}

//Writer
class Writer{
    //field
    private int id;
    private String name;
    private String surname;

    //constructor
    public Writer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
    }
    //toString
    @Override
    public String toString() {
        return "Writer{" + "id=" + id + ", name=" + name + ", surname=" + surname + '}';
    }

    //Nested Class (inner class)
    //Normalde Javada birden fazla public veya static class  yazamazsınız (inner class hariç)
    public static class Builder{
        //field
        private int id;
        private String name;
        private String surname;

        //parametresiz constructor
        public Builder() {
        }

        //parametreli Builder Class id Metodu
        public Builder id (int id) {
            this.id = id;
            return this;
        }
        //parametreli Builder Class name Metodu
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        //parametreli Builder Class surname Metodu
        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        //build: ana class ile nested classı bağla
        public Writer build(){
            return new Writer(this);
        }

    }
}


//PSVM MainClass
class MainClass{
    public static void main(String[] args) {
        Writer writer=new Writer.Builder().id(1).name("Hamit").surname("Mızrak").build();
        System.out.println(writer);
    }
}
