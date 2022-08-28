package com.hamitmizrak.java;

public class _043_JavaEllipsis {
    // JAVA (...)           ==>  Java Ellipsis
    // JAVASCRIPT (...) ==> Rest Operator(Rest Parameter)

    // Normal dizi parametresi alan method
    public static void arrayNormalMethod(int[] dizi){
        for(int temp:dizi){
            System.out.print(temp+" ");
        }
    }

    // Ellipsis dizi method
    public static void arrayEllipsisMethod(int... dizi){
        for(int temp:dizi){
            System.out.print(temp+" ");
        }
    }


    public static void main(String[] args) {
        int [] dizi={1,2,3,4,5};
        arrayNormalMethod(dizi);
        System.out.println("\n**************************");
        arrayEllipsisMethod(dizi);
    }

}
