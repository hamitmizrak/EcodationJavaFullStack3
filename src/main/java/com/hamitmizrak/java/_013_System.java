package com.hamitmizrak.java;

import java.util.Date;

public class _013_System {

    public static void main(String[] args) {
        //System
        //System.in    ==>  Javaya Veri girişi
        //System.out  ==> Javadan Veri çıkışı
        System.out.print("Bundan sonraki alt satıra geçirmez");
        System.out.println("Deneme");
        System.err.println("Error C");

        //Şu andaki zamanı verir
        System.out.println(new Date(System.currentTimeMillis()));

        //Garbarage Collection
        System.gc();

        //logout
        System.exit(0);
    }
}
