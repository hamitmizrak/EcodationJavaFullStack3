package com.hamitmizrak.socket;

// Two way (Cleint-Server String  Message Examples)
// Client kullanıcıadan alınan veriri Servera -  Server-Client

// UNUTMA
// 1-) Öncelikle Server Çalıştırmalısın (Hazır olmalıdır)
// 2-) Daha Sonra Client çalıştırmalısın
// 3-) Client Server olduğundan farklı terminallerde göreceksin
// 4-) PSVM Server-Client olacak
// 5-) Java.net kütüphanesini import edeceğiz.

import java.io.*;
import java.net.Socket;

public class TwoWayClient {

    //object variable

    //Mesaj almak
    private static String receiveMessage;

    //Mesaj almak
    private static String sendMessage;

    //Two Way Client Method
    private static void toWayClient(){
        try {
            System.out.println("CLIENT HAZIR");
            //import java.net.Socket;
            Socket socket=new Socket("localhost",4444);

            //Client Servere Veri gönderecek
            //import java.io.BufferedReader;
            BufferedReader bufferedReader1=new BufferedReader(new InputStreamReader(System.in));
            //import java.io.OutputStream;
            OutputStream outputStream=socket.getOutputStream();
            PrintWriter printWriter=new PrintWriter(outputStream,true);

            //Serverde gelen veriyi alacak
            InputStream inputStream=socket.getInputStream();
            BufferedReader bufferedReader2=new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("Client: Lütfen mesaj yazınız");

            while(true){
                //clienttan veri almak
                sendMessage=bufferedReader1.readLine();
                printWriter.println(sendMessage);
                printWriter.flush();

                if(  (receiveMessage=bufferedReader2.readLine())!=null  ){
                    System.out.println("SERVER: "+receiveMessage);
                }
            }

        }catch (IOException ioException){
            ioException.printStackTrace();
            throw new HamitMizrakException("Client  Socket programming failed");
        }//end catch
    }//end toWayClient

    //PSVM
    public static void main(String[] args) {
        toWayClient();
    }

}//end TwoWayClient Class
