package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class _031_TryCatchExceptionError {

    public static void main(String[] args) throws ArithmeticException, NullPointerException, _032_HamitMizrak {
        //syntax error
        // Int number=44;
        // System.out.println(number);

        //logical error
        try {
            int number1=2;
            int number2=0;
            int number3= number1/number2;
            throw new ArithmeticException("Sıfıra Bölemezsiniz ikinci sayı sıfır olmamalıdır");
        }catch (ArithmeticException | NullPointerException ai) {

            System.out.println("ai exception: "+"getMessage: istisnanın mesajı ==>"+ai.getMessage());
            System.out.println("ai exception: "+"toString: istisna adı ve istisna mesajını ==>   "+ai.toString());
            System.out.println("printStackTrace");
            ai.printStackTrace();
            System.out.println("getStackTrace ==> bizi istisnanın bilgilerilerini dizi olarak döner");
            StackTraceElement [] dizi=   ai.getStackTrace();
            for(StackTraceElement temp:dizi){
                System.out.println(temp);
            }
        } catch ( Exception exception) {
            System.out.println("common exception");
            exception.printStackTrace();
        }finally {
            System.out.println("Sistemde her halikarda çalışacak yeğane yerdir.");
            System.out.println("database.close() socket.close()");
        }

        System.out.println("Son data");

        //throw: kendi ististinamızı oluşturduj
        //throw new ArithmeticException("Sıfıra Bölemezsiniz ikinci sayı sıfır olmamalıdır");
        throw new _032_HamitMizrak(" Sifira Bolemezsiniz ikinci sayi sifir olamalidir.");
    }
}