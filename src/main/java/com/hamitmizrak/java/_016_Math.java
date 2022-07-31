package com.hamitmizrak.java;

public class _016_Math {

    public static void main(String[] args) {
        //Math: Mathematics kısaltmasıdır
        //Math sınıf static bir yapıya sahiptir
        //java.lang kütüphanesinden import ederiz.
        //Math iç içe yazabilirsiniz ==>  Math.round(Math.random())

        // 2 tane sabitimiz vardır
        //Math.PI  ==> 3.14 (final double)
        //Math.E   ==> 2.71 (final double)

        //Sabitler
        System.out.println("PI SAYISI: "+Math.PI);
        System.out.println("E SAYISI: "+Math.E);

        //Hesap işlemler
        System.out.println("KAREKÖK: "+Math.sqrt(16));
        System.out.println("MUTLAK DEĞER: "+Math.abs(-4));
        System.out.println("ÜSLÜ DEĞER: "+Math.pow(2,5));

        //min max
        System.out.println("MIN: "+Math.min(-2,500));
        System.out.println("MAX: "+Math.max(-2,500));

        //Yuvarlama
        System.out.println("YUKARI YUVARLA: "+Math.ceil(4.1));
        System.out.println("AŞAĞI YUVARLA: "+Math.floor(4.1));
        System.out.println("AŞAĞI/YUKARI YUVARLA: "+Math.round(6.5)); //.5 ve yukarı ise yukarı yuvarlar
        System.out.println("AŞAĞI/YUKARI YUVARLA: "+Math.round(6.4)); //.4 ve yukarı ise aşağı yuvarlar

        //Rastgele
        System.out.println(Math.round(Math.random()*4+1));
    }
}
