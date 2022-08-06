package com.hamitmizrak.java;

public class _030_CompilerTimeError {
    public static void main(String[] args) {
        StackOverflow.test(5);
    }
}


// Class 1
class StackOverflow {

    // method of this class
    public static void test(int i)
    {
        // No correct as base condition leads to
        // non-stop recursion.
        int counter=0;
        if (i == 0)
            return;
        else {
            test(i++);
            counter++;
        }
        System.out.println("Counter: "+counter);
    }
}