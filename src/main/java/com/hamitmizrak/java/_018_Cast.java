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

        //6-) String'i  ==> Tam sayıya çevirmek
        String str6="14";
        System.out.println(16+str6);

        //1.YOL: wrapper tür olarak veri döner
        int stringToInteger1=Integer.valueOf(str6);
        System.out.println(16+stringToInteger1);

        //2.YOL: primitive türden veri döner
        int stringToInteger2=Integer.parseInt(str6);
        System.out.println(16+stringToInteger2);

        //7-) Tam sayıyı ==> String'e çevirmek
        int number7=20;
        System.out.println(number7+"30");

        //1.YOL: wrapper tür olarak veri döner
        String cast7_1=String.valueOf(number7);
        System.out.println(cast7_1+"30");

        //2.YOL:
        String cast7_2=Integer.toString(number7);
        System.out.println(cast7_2+"30");
    }
}
