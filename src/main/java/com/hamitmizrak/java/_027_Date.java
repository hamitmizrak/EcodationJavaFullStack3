package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Log4j2
public class _027_Date {

    public static void main(String[] args) {
        // 1 ocak 1970
        // 1900 ekle veya çıkar
//      java.util.Date date=new Date();
//      log.info(date);
//      log.info(date.getDate());
//      log.info(date.getDay()); //1-31
//      log.info(date.getMonth()); // 0 -11
//      log.info(date.getHours()); //0-23
//      log.info(date.getMinutes());//0-59
//      log.info(date.getSeconds());//0-59

        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("[dd - MMMM - yyyy] HH:mm:ss",locale);

        //Date
        Date date=new Date();
        String str=simpleDateFormat.format(date);
        System.out.println(str);

        //Calendar
        Calendar calendar=Calendar.getInstance();
        String str2=simpleDateFormat.format(calendar.getTime());
        System.out.println(str2);


     }
}