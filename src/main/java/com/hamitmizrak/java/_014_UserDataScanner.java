package com.hamitmizrak.java;

import java.util.Scanner;

public class _014_UserDataScanner {

    public static void main(String[] args) {
        //Scanner : java util paketinden gelir kullanıcıdan veri almak istediğimizde kullanırıız.
        //Ancak Scanner'da char için kullanamıyoruz. ancak biz başka yöntemle alabiliriz.
        ////char yoktur
        //nextByte() nextShort() nextInt() nextLong() nextFloat() nextDouble() next() nextLine()
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String nameData=klavye.nextLine();
        System.out.println(nameData);

        //Bir tuşa basınız
        System.out.println("Lütfen Herhangi bir tuşa basınız");
        klavye.hasNext();

        //Scanner char kullanmak istiyorum
        System.out.println(nameData.charAt(0));

        //klavye kapat ancak bu satırdan sonra klavye çağırırsak hatalarla karşılaşırız.
        klavye.close();
    }
}
