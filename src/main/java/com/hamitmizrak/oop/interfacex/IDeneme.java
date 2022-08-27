package com.hamitmizrak.oop.interfacex;

public interface IDeneme {

    //gövdesiz metotlar
    public void govdesizMethod1();
    public String govdesizMethod2(String name);

    //gövdeli metot
    default void govdeliMethod(){
        System.out.println("Gövdeli Method");
    }
}
