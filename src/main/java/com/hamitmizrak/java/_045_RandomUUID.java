package com.hamitmizrak.java;


import java.util.Base64;
import java.util.Scanner;
import java.util.UUID;

//Java 8 gelen özelliktir.
public class _045_RandomUUID {

    //PSVM
    public static void main(String[] args) {
        // Random unique (benzersiz tekil bir yapı) için kullanıyoruz.
        //Java Util paketinten türetilir
        // hexadecimal tabanlıdır
        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);

        //String'e çevirdim
        String data=uuid.toString();
    }

}//_045_RandomUUID
