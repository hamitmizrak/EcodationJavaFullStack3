package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.util.Date;
import java.util.Scanner;

@Log4j2
public class _026_Formatter {

    public static void main(String[] args) {
     //System
        //System.out.println("Cikti" );
        //System.err.println("Cikti" );
       // System.out.print("Cikti " );



        //System.out.printf();
        // SeDeF :
        String s="["+new Date(System.currentTimeMillis()).toString()+"]";
        String s1=_026_Formatter.class+"";
        int d=44;
        float f=44.23f;
        System.out.printf("%-40s  %-50s %d %f",s,s1,d,f);

        }
}