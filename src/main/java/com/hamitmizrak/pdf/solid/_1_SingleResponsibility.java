package com.hamitmizrak.pdf.solid;

//SOLID
public class _1_SingleResponsibility {

    //Single Responsibility :
    public void fileIo(){
        System.out.println("fileIO Send");
    }

    public void email(){
        System.out.println("Email Send");
    }

    public void sms(){
        System.out.println("SMS Send");
    }

    public void message(){
        email();
        sms();
        fileIo();
    }
}



