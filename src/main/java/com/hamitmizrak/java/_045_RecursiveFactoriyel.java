package com.hamitmizrak.java;

import com.hamitmizrak.socket.HamitMizrakException;
import lombok.extern.log4j.Log4j2;
import java.util.Scanner;

@Log4j2
public class _045_RecursiveFactoriyel {

    //User Data
    private static int userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı yazınız");
        char dataValue = klavye.nextLine().charAt(0);
        return validationData(dataValue);
    }

//validation Data
    private static int validationData(char dataValue){
        if (Character.isDigit(dataValue))
           return Character.getNumericValue(dataValue);
        else if (Character.isLetter(dataValue)) {
            log.info("Bu bir harftir");
            userData();
        } else{
            System.out.println("Bu bir özel simgedir");
            userData();
        }
        return Character.getNumericValue(dataValue);
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
     int result1=userData();
      int result2=recursiveFactoriyel(validationData((char) result1));
      System.out.println(result2);
  }
    }

}//_045_RecursiveFactoriyel
