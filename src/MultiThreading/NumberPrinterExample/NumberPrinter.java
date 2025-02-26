package MultiThreading.NumberPrinterExample;

import java.util.Enumeration;

public  class NumberPrinter implements Runnable {

     int number;
     public NumberPrinter(int number){
         this.number = number;
     }
     @Override
      public void run(){
//          for(int i =0;i<100 ;i++)
//          {
//              System.out.println("Hello from "+ Thread.currentThread().getName() + " i :" +i);
//          }

         System.out.println("Printing " + number +"from " + Thread.currentThread().getName());
      }
}
