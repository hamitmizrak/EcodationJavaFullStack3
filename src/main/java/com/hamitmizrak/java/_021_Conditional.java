package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class _021_Conditional {
    public static void main(String[] args) {

        //global variable
        int number=45;

        //conditional: if else
        if(number>=10){
            System.out.println("sayı 10 büyüktür");
        }else{
            System.out.println("sayı 10 küçüktür");
        }

        //Ternary: daha yazılabilir. daha az kodla  gösterdik
        String resultTernary= (number>=10) ? "sayı 10 büyüktür":"sayı 10 küçüktür" ;
        System.out.println(resultTernary);
    }
}