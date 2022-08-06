package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Log4j2
public class _028_LocalDate {

    public static void main(String[] args) {
        //pattern
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("[dd - MMMM - yyyy] HH:mm:ss",locale);

        //1-Date
        Date date=new Date();
        String str=simpleDateFormat.format(date);
        System.out.println(str);

        //2-Calendar
        Calendar calendar=Calendar.getInstance();
        String str2=simpleDateFormat.format(calendar.getTime());
        System.out.println(str2);

        //3-LocalDate
        // Class	                  Description
       //  LocalDate	       (year, month, day (yyyy-MM-dd))
       //  LocalTime	       (HH-mm-ss-ns)
       //  LocalDateTime 	(yyyy-MM-dd-HH-mm-ss-ns)
       //  DateTimeFormatter	Formatter for displaying and parsing date-time objects

        //java.time
        //LocalDate
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        //LocalTime
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        //LocalDateTime
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        //Pattern
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
        String str3=dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(str3);
     }
}