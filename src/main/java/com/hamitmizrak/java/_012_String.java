package com.hamitmizrak.java;

import java.util.Locale;

public class _012_String {

    //psvm ===> TAB
    public static void main(String[] args) {
        //String primitive type değildir.
        String dataValue = "Merhabalar Nasılsınız";
        System.out.println("Karakter Sayısı: " + dataValue.length());
        System.out.println("trim: başından veya sonunda boşlukları al" + dataValue.trim().length());
        System.out.println("M ile mi başlıyor" + dataValue.startsWith("M"));
        System.out.println("z ile mi bitiyor" + dataValue.endsWith("z"));
        System.out.println("bütün harfler küçük olsun" + dataValue.toLowerCase());
        System.out.println("bütün harfler büyük olsun" + dataValue.toUpperCase());

        //charAt: biz sayı veririz bize harf döner ==> sıfırıncı indisten başlar bize harf döner
        System.out.println(dataValue.charAt(0));
        System.out.println(dataValue.charAt(20));
        System.out.println(dataValue.charAt(dataValue.length() - 1));

        //indexOf ==>Harf veririrz bize sayı döner
        System.out.println(dataValue.indexOf("Merhabalar"));
        System.out.println(dataValue.lastIndexOf("Merhabalar"));

        //replace: değiştirmek için
        String newData = "Yeni kelime";
        String allData = dataValue.replace(dataValue, newData);
        System.out.println(allData);

        //contains: Bu cümlede bu kelime geçiyor mu ? sonuç doğruysa: true döner
        System.out.println(dataValue.contains("Merhabalar"));

        //concat: cümlenin sonuna ekleme yapar.
        String data = dataValue.concat(".INC");
        System.out.println(data);

        //isEmpty(): Boş mu ? eğer varsa hayır dolu dönüş false
        System.out.println(dataValue.isEmpty());

        //equals: kelimeler birbirine eşit mi eşitse dönüş true
        System.out.println(dataValue.equals("Merhabalar Nasılsınız Merhabalar"));


        //subString: kelimeyi parçalamak
        //unutma: subString conditional ile çözmemiz gerekiyor.
        if (dataValue.length() > 30) {
            System.out.println(dataValue.substring(1));
            System.out.println(dataValue.substring(1, 4)); //1<=X<=4-1
            //kelimenin sondan 2 karakterden sonrasını göster
            System.out.println(dataValue.substring(30));
            System.out.println(dataValue.substring(dataValue.length() - 2));
        }

     //split: regex String dizisine dönüştürür.
        String[] arrayData = dataValue.split(" ");
        for (String temp : arrayData) {
            System.out.println(temp);
        }


    }
}
