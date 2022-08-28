package com.hamitmizrak.socket;
// Two way (Cleint-Server String  Message Examples)
// Client kullanıcıadan alınan veriri Servera -  Server-Client

// UNUTMA
// 1-) Öncelikle Server Çalıştırmalısın (Hazır olmalıdır)
// 2-) Daha Sonra Client çalıştırmalısın
// 3-) Client Server olduğundan farklı terminallerde göreceksin
// 4-) PSVM Server-Client olacak
// 5-) Java.net kütüphanesini import edeceğiz.

import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@Log4j2
public class TwoWayServer {

    //object variable

    //Mesaj almak
    private static String receiveMessage;

    //Mesaj almak
    private static String sendMessage;

    //Two Way Server Method
    private static void toWayServer(){
        try {
            System.out.println("SERVER HAZIR");
            //import java.net.ServerSocket;
            ServerSocket serverSocket=new ServerSocket(4444);

            //import java.net.Socket;
            Socket socket=serverSocket.accept();

            //Veri göndermek
            OutputStream outputStream=socket.getOutputStream();

            //Veri okumak,almak
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

            //true: autoFlush
            PrintWriter printWriter=new PrintWriter(outputStream,true);

            InputStream inputStream=socket.getInputStream();
            BufferedReader receiveRead=new BufferedReader(new InputStreamReader(inputStream));

            //Message Sonsuz döngü
            while(true){
                if((receiveMessage=receiveRead.readLine())!=null){
                    System.out.println("CLIENT: "+receiveMessage);
                    //DOSYA YAZDIR
                }
                sendMessage=bufferedReader.readLine();
                printWriter.println(sendMessage);
                printWriter.flush();
            }

        }catch (IOException ioException){
            ioException.printStackTrace();
            throw new HamitMizrakException("Server Socket programming failed");
        }//end
    } //end toWayServer


    //PSVM
    public static void main(String[] args) {
        toWayServer();
    }

}//end TwoWayServer Class
