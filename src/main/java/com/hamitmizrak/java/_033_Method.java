package com.hamitmizrak.java;


import java.util.Scanner;
import java.util.UUID;

public class _033_Method {


    public  static void voidliParametresizMethod() {
        System.out.println("voidli Parametresiz Method");

        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);
    }


    public static void voidliParametreliMethod(int sayi) {
        System.out.println("voidli Parametreli Method " + sayi);
    }


    public  static String voidsizParametresizMethod() {
        return "voidsiz Parametresiz Method";
    }

    public static String voidsizParametreliMethod(String data) {
        return "voidsiz Parametresiz Method "+data;
    }

    //recursive Method
    public static int useData(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        return klavye.nextInt();
    }

    //4!=4 * 3 *2*1
    public static int recursiveFactoriyel(int number) throws _032_HamitMizrak {
        if(number<0)
            throw  new _032_HamitMizrak("Sıfırdan Küçük giremezsiniz");
       if(number==0 || number==1)
           return 1;
        return  number*recursiveFactoriyel(number-1);
    }



    public static void main(String[] args) throws _032_HamitMizrak {

        while(true){
            int number=useData();
            int result=recursiveFactoriyel(number);
            System.out.println(number+"sayısının Faktöriyel Sonucu: "+result);

        }
//
//        voidliParametresizMethod();
//        voidliParametreliMethod(44);
//
//     String str1=   voidsizParametresizMethod();
//        System.out.println(str1);
//
//        String str2=   voidsizParametreliMethod("Merhabalar");
//        System.out.println(str2);
    }


}