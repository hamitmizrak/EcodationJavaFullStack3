package com.hamitmizrak.java;

//ENUM
//Önceden sabitlenmiş veriler için kullanıyoruz.
//1 metre:100cm , 1kg=1000gr ,Aylar:12 tanedir Gün: 24 saat, Ölçüler:Küçük,Orta,Büyük
//1 saat:60 dakika 1dakika=60 saniye 1 saniye=1000milisaniye
//Java 5 gelen özelliktir.
//Tür güvenliğini Sağlamak(type safe)
//Classlara benzemektedir. Classtaki en önemli farkı Tür Güvenliğini sağlamak
//Sadece bizim verdiğimiz değerler dışında her hangi bir değer veremezsiniz
//Kodların daha okunaklı bir sayı bize sunar.

//Dikkat:
//Değişkenlerde final kullanmalıyız.
// Amaçımız encapsulationda setter gelmesin

//constructurda private olmalıdır.
//constructur private olursa instance (new) oluşturamayız.

import nonapi.io.github.classgraph.json.JSONUtils;

//ICE
//interface ==> public interface isim{}
//class      ==> public class isim{}
//enum    ==>  public enum isim{}
public enum _034_Enum {
    //enum sıra numarası yani ordinal sıfırdan başlar
PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}

//class
class Olcu{
    public static void main(String[] args) {
        _034_Enum enumVariable=_034_Enum.PAZARTESI;
        System.out.println(enumVariable);
        System.out.println("Sıra: "+enumVariable.ordinal());
        System.out.println("Values: "+enumVariable.values()[0]);

        String str=_034_Enum.PAZARTESI.toString();
        System.out.println("toString ==> "+str);

        for( _034_Enum temp  :_034_Enum.values()){
            System.out.print(temp+" ");
        }
    }



}