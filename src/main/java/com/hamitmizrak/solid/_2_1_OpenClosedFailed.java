package com.hamitmizrak.solid;

//Yeni Özelliklere Açık
//var olan özellikleri değiştirmeye kapalı
public class _2_1_OpenClosedFailed {

    public static String hashPassword(String hashingType) {
        String passwordInformation="Other Hashed";
        if("Base64".toLowerCase().equals(hashingType))
            passwordInformation="Base64 Hashed";
        else if("Md5".toLowerCase().equals(hashingType))
            passwordInformation="MD5 Hashed";
        return passwordInformation;
    } //end hashPassword

    //PSVM
    public static void main(String[] args) {
     String result=   hashPassword("md5");
        System.out.println(result);
    }

}//end _2_OpenClosed class
