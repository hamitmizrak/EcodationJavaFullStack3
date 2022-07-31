package com.hamitmizrak.java;

import java.util.Random;

public class _016_Random {
    public static void main(String[] args) {
        //Math sınıf static bir yapıya sahiptir
        //Rastgele
        double rastgele1=Math.round(Math.random()*4+1);
        System.out.println(rastgele1);

        //Random classtır ==> object
        Random random=new Random();
        int  rastgele2=random.nextInt(4)+1;
        System.out.println(rastgele2);
    }
}
