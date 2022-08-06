package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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

       //Pattern Date
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("[dd - MMMM - yyyy] HH:mm:ss", locale);
        Date date2 = new Date();
        String str = simpleDateFormat.format(date2);

        //Manuel Date
        Date date1 = new Date();
        String allTime = String.valueOf(date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds());

        String systemDate = "[" + new Date(System.currentTimeMillis()).toString() + "]"+allTime;
        String allClass = _026_Formatter.class + "";

        int d = 44;
        float f = 44.23f;
        System.out.printf("%-20s   %-40s %-40s %-20d %3.2f", str, systemDate, allClass, d, f);

    }
}