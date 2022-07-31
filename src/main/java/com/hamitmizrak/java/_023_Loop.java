package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class _023_Loop {
    public static void main(String[] args) {

        //Loop Döngüde
        //1-) iterative for
        //NOT:  for sonsuz döngü ==> for(;;){}
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n**********************");

        //2-) while
        //NOT:  for sonsuz döngü ==> while(true){}
        int k= 0;
        while(k<10){
            System.out.print(k+" ");
            k++;
        }
        System.out.println("\n**********************");
        //3-) do-while: şart sağlansın veya sağlanması en az 1 kez çalışır
        int m= 0;
        do{
            System.out.print(m+" ");
            m++;
        }while(m<10);
    }
}