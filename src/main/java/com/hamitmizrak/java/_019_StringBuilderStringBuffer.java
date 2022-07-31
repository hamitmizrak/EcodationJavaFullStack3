package com.hamitmizrak.java;

public class _019_StringBuilderStringBuffer {
    public static void main(String[] args) {
        //String Birleştirmek
        String str1="JavaSE",str2="JavaEE",str3="JavaME";

        //1-) Birleştirme(Artı operant):
        // hantaldır. her data için döngü bir kere daha çalışır
        String sb1=str1+str2+str3;
        System.out.println(sb1);

        //2-) Birleştirme(concat method):
        String sb2=str1.concat(str2).concat(str3);
        System.out.println(sb2);

        //       String Builder          String Buffer
        // 1-) Not Thread-safe       Thread Safe
        // 1-) faster                         slow
        // 1-) Java 5                       Java 1
        // 1-) güvensizdir               Daha güvenli
        // 1-) Asenkron                  Senkron(aynı anda sadece bir iş çalışır)

        //3-) StringBuilder: database,services,socket
        StringBuilder sb3=new StringBuilder();
        sb3.append(str1).append(str2).append(str3);
        String changeString3=sb3.toString();
        System.out.println(changeString3);

        //4-) StringBuffer
        StringBuffer sb4=new StringBuffer();
        sb4.append(str1).append(str2).append(str3);
        String changeString4=sb4.toString();
        System.out.println(changeString4);
    }
}
