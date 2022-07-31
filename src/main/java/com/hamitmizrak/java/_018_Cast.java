package com.hamitmizrak.java;

import java.util.Random;

public class _018_Cast {
    public static void main(String[] args) {
        //Cast: dönüştürme
        //String => tam sayıya çevirmek
        //Tam sayı=> String'e çeviriri

        //1-) Cast float,double  ==> f-L
        float f1=14.45f;
        float f2=(float)14.45;

        long l1=15551515L;
        long l2=(long)15551515;

        //2-) Büyük olanının içine küçük ekleyebilirsiniz
        byte b3=14;
        long l3=b3;

        //3-) Büyük olanının içine küçük ekleyebilirsiniz
        long l4=1515151545L;
        byte b4= (byte) l4;

        //4-)Boxing: primitive Türü(null veremezsiniz) Wrapper(null verebiliriz) Class benzetmedir.
        int primitive5=44545;
        Integer wrapper5=primitive5;

        //5-)UnBoxing:  Wrapper Class primitive Türe benzetmedir.
        Integer wrapper6=121389;
        int primitive6=wrapper6;

    }
}
