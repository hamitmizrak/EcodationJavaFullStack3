package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class _022_Conditional2 {
    public static void main(String[] args) {

        //global variable
        int number = 5;

        //conditional: if - else if - else
        if (number == 1) {
            System.out.println("sayı 1");
        } else if (number == 2) {
            System.out.println("sayı 2");
        }  else if (number == 3) {
            System.out.println("sayı 3");
        } else if (number == 4) {
            System.out.println("sayı 4");
        } else if (number == 5) {
            System.out.println("sayı 5");
        } else {
            System.out.println("sayı 5 büyüktür");
        }


        //switch case
        switch (number){
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;
            case 5:
                System.out.println("sayı 5");
                break;
            default:
                System.out.println("sayı 5 büyüktür");
                break;
        }
    }
}