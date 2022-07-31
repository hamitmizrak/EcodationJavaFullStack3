package com.hamitmizrak.java;

import java.util.Scanner;

public class _015_EscapeCharacter {

    public static void main(String[] args) {
        //EscapeCharacter: Çıkış karakterdir.
        //Bazen özel simgeleri kullanamadığımız zaman kullanırız.
        // ters slash(\) kullanıyoruz.

        System.out.println(" \" " );
        System.out.println(" \' " );
        // \n ==> yeni bir satır
        // \r  ==> alt satır
        // \t  ==> bir tab kadar boşluk
        System.out.println("1.satır\n\r\t2.satır " );
    }
}
