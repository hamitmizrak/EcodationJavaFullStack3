package com.hamitmizrak.pdf.solid;

public interface _2_2_OpenClosedSuccess {
    //Gövdesiz  method
    public  String hashPassword(String hashingType);
} // end interface


//Base64Type
class Base64Type implements  _2_2_OpenClosedSuccess{
    @Override
    public String hashPassword(String hashingType) {
        return "Base64 Hashed "+hashingType;
    }
} //end Base64Type


//Md5Type
class Md5Type implements  _2_2_OpenClosedSuccess{
    @Override
    public String hashPassword(String hashingType) {
        return "Md5Type "+hashingType;
    }
} //end Md5Type


//PSVM
 class MainClass{
    public static void main(String[] args) {
        Base64Type base64Type=new Base64Type();
     String result1=   base64Type.hashPassword("base64 2.type");
        System.out.println(result1);

        Md5Type md5Type=new Md5Type();
        String result2= md5Type.hashPassword("md5 2.type");
        System.out.println(result2);
    }

}