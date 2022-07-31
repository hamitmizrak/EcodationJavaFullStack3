package com.hamitmizrak.java;
import javax.swing.*;
public class _014_UserDatajOptional {
    public static void main(String[] args) {
        //import javax.swing.jOptionPane;
        //JOptionPane: dönüşü String'tir.
        String dataValue = JOptionPane.showInputDialog("Lütfen birşey giriniz");
        System.out.println(dataValue.substring(0));

       //String ==> To Cast
        int dataNumber = Integer.valueOf(JOptionPane.showInputDialog("Lütfen bir sayı giriniz"));
        System.out.println(dataNumber * dataNumber);
    }
}
