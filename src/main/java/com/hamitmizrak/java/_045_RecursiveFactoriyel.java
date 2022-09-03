package com.hamitmizrak.java;

import com.hamitmizrak.socket.HamitMizrakException;
import lombok.extern.log4j.Log4j2;
import java.util.Scanner;

@Log4j2
public class _045_RecursiveFactoriyel {

    //User Data
    private static char userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı yazınız");
        char dataValue = klavye.nextLine().charAt(0);
        return dataValue;
    }

//validation Data
    private static int validationData(){
        char dataValue=userData();
        if (Character.isDigit(dataValue))
            log.info("Bu bir sayıdır");
        else if (Character.isLetter(dataValue)) {
            log.info("Bu bir harftir");
            validationData();
        } else{
            System.out.println("Bu bir özel simgedir");
            validationData();
        }
        //return Character.getNumericValue(dataValue);
        System.out.println(dataValue);
        return Integer.valueOf(dataValue) ;
    }


    //recursive Method
    public static Integer recursiveFactoriyel(int fac){
        if(fac<0)
            throw new HamitMizrakException("Sıfırdan Küçük giremezsiniz");
        if(fac==0 || fac==1)
            return 1;
        return fac*recursiveFactoriyel(fac-1);
    }

    //PSVM
    public static void main(String[] args) {
  while(true){
      int result2=recursiveFactoriyel( validationData());
     // int result2=recursiveFactoriyel(4);
      System.out.println(result2);
  }
    }

}//_045_RecursiveFactoriyel
