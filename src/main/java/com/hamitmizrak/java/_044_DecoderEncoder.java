package com.hamitmizrak.java;


import java.util.Base64;
import java.util.Scanner;

//Java 8 gelen özelliktir.
public class _044_DecoderEncoder {
    private static String USER_DATA_STATIC = "";

    private static String userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String user = klavye.nextLine();
        USER_DATA_STATIC = user;
        return user;
    }

    //Encoder Method
    public static String encoderMethod(String klavye) {
        //import java.util.Base64;
        Base64.Encoder encoderData = Base64.getEncoder();
        //Veriyi şifrelemek
        String sifrele = encoderData.encodeToString(klavye.getBytes());
        return sifrele;
    }

    //Decoder Method
    public static String decoderMethod(String sifrelenmisData) {
        Base64.Decoder decoderData = Base64.getDecoder();
        String sifreCoz = new String(decoderData.decode(sifrelenmisData));
        return sifreCoz;
    }

    //PSVM
    public static void main(String[] args) {
        String klavye = userData();
        String sifrelenmisVeri = encoderMethod(klavye);
        String sifreCoz = decoderMethod(sifrelenmisVeri);
        System.out.println("İlk Hali: " + klavye);
        System.out.println("Şifrelenmiş Hali: " + sifrelenmisVeri);
        System.out.println("Şifrenin Çözülmüş Hali: " + sifreCoz);
    }

}//_044_DecoderEncoder
