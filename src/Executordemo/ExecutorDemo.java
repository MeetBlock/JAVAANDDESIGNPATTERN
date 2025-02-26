package Executordemo;

import MultiThreading.NumberPrinterExample.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++)
        {
            if(i == 80){
                System.out.println("Debug");
            }
//            Thread t =  new Thread(new NumberPrinter(i));
            executor.execute(new Executordemo.NumberPrinter(i));
        }
        executor.shutdown();
    }
}
