package com.hamitmizrak.desinpattern.creational;

// sadece 1 tane instance kullanmak kullanıyoruz
public class _1_Singleton {

    //1 constructor private yapmak
    private  _1_Singleton(){}

    //Class değişkeni
    private static _1_Singleton instance;

   public static _1_Singleton getInstance() {
       if(instance==null){
           instance=new _1_Singleton();
       }
       return instance;
   }

}
