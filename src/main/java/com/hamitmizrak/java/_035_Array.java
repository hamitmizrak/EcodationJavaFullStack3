package com.hamitmizrak.java;


import java.util.Random;

public class _035_Array {

    public static void main(String[] args) {
        int [] dizi=new int[10];
        for (int i =0; i <10 ; i++) {
            Random rastgele=new Random();
            int number= rastgele.nextInt(10)+1;
            dizi[i]=number;
        }

        for (int i = 0; i <dizi.length ; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println();
        for (    int temp : dizi  ) {
            System.out.print(temp+" ");
        }

        System.out.println("\nilk eleman:"+dizi[0]+" son eleman: "+dizi[dizi.length-1]);

        System.out.println("********************************");
        java.util.Arrays.sort(dizi);
        for (    int temp : dizi  ) {
            System.out.print(temp+" ");
        }

    }

}