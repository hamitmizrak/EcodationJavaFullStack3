package com.hamitmizrak.java;

import java.util.Random;
import java.util.Scanner;

public class _037_ArrayExamples {

    private static Scanner klavye=new Scanner(System.in);

    public static int userData(){
        System.out.println("Lütfen Dizi eleman sayısını giriniz");
      return klavye.nextInt();
    }

    //Dizi
    public static void arrayData(){
        double sum=0,average=0;
        int oddSum=0,evenSum=0;

        int [] dizi=new int[userData()];

        for (int i =0; i <dizi.length ; i++) {
            Random rastgele=new Random();
            int number= rastgele.nextInt(10)+1;
            dizi[i]=number;
            sum+=dizi[i];

            if(dizi[i]%2==0)
                evenSum+=dizi[i];
            else
                oddSum+=dizi[i];
        }

        for(int temp: dizi){
            System.out.print(temp+" ");
        }

        System.out.println("\nToplamları: "+sum);
        System.out.println("Ortalaması: "+sum/dizi.length);
        System.out.println("Çift sayılar toplamı: "+evenSum);
        System.out.println("Tek sayılar toplamı: "+oddSum);

    }



    public static void main(String[] args) {

    //konsoldan kaç elemanlı bir dizi olacağını belirtinsin
        // 1-10 arasında  verilen eleman sayı kadar sayı üretsin
        // bu sayılarımızın
        //Toplamı
        //ortalaması
        //çift sayılar toplamı
        //tek sayılar toplamı Method

        arrayData();

    }
}