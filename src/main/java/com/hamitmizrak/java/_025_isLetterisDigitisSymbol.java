package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class _025_isLetterisDigitisSymbol {
    public static void main(String[] args) {
        //Character ==> java.lang kütüphane gelir
        while(true){
        Scanner klavye = new Scanner(System.in);
        System.out.println("\nLütfen bir harf giriniz");
        //char cevirdim
        char dataValue = klavye.nextLine().charAt(0);

        if (Character.isDigit(dataValue))
            System.out.println("Bu bir sayıdır");
        else if (Character.isLetter(dataValue))
            System.out.println("Bu bir harftir");
        else
            System.out.println("Bu bir özel simgedir");
        }
    }
}