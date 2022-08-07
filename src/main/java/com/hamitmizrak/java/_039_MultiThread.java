package com.hamitmizrak.java;

//class      ==> extends Thread
//interface ==> implement Runnable
//Metot    ==> Thread t1=new Thread(new Runnable());

import lombok.Getter;
import lombok.Setter;

// 1-) extend
@Getter @Setter
public class _039_MultiThread  extends  Thread{

    //Object variable
    private String className;

    //parametresiz constructor
    public _039_MultiThread() {
    }

    //parametreliconstructor
    public _039_MultiThread(String className) {
        this.className = className;
    }

    @Override
    public void run() {
        for (int i = 1;  i <= 10; i++) {
            try {
                Thread.sleep(500);

                if(i==1){
                    System.out.println("\n####Başlangıç");
                    System.out.println(this.className);
                }else if(i==10){
                    System.out.println("\n####Bitiş");
                System.out.println(this.className);
            }else{
                    System.out.println(this.className);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

 class _039_MultiThread0{
     public static void main(String[] args) throws InterruptedException {
         _039_MultiThread thread1=new _039_MultiThread("1.instance");
         _039_MultiThread thread2=new _039_MultiThread("2.instance");
         _039_MultiThread thread3=new _039_MultiThread("3.instance");

         thread1.setPriority(Thread.MIN_PRIORITY);
         thread2.setPriority(Thread.NORM_PRIORITY);
         thread3.setPriority(Thread.MAX_PRIORITY);

         thread1.start();
         thread2.start();
         thread3.start();
         thread3.wait();
         thread3.notifyAll();

         System.out.println("getClassName: "+  thread1.getClassName());
         System.out.println("getId: "+  thread1.getId());
         System.out.println("getName:  "+  thread1.getName());
         System.out.println("hashCode: "+  thread1.hashCode());
         System.out.println("isAlive:  "+  thread1.isAlive());
          thread1.setName("yeni ad");
         System.out.println("getName: "+  thread1.getName());

     }
}



// 2-) interface
 class _039_MultiThread2  implements  Runnable {

     @Override
     public void run() {

     }
 }


// 3-) Method
class _039_MultiThread3   {

    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
