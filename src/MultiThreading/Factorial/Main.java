package MultiThreading.Factorial;

import OOPS3.Instructor;

import java.math.BigInteger;
import java.util.*;

public class Main {

    // Task to calculate factorials of list of numbers

    public static void main(String[] args) throws InterruptedException{
//        BigInteger b1 =  BigInteger.valueOf(586826836);
//        BigInteger b2 = BigInteger.valueOf(786386883);
//
//        System.out.println(b1.multiply(b2));

        List<Long> inputNumbers = Arrays.asList(787686863L,822L,862L,838L,646L);
        List<Factorial> threads = new ArrayList<>();
        for(long number : inputNumbers){
            Factorial t = new Factorial(number);
            threads.add(t);
            System.out.println(t.getState());
        }

        for(Thread t: threads){
            t.start();
            System.out.println(t.getState());
        }

        for(Thread t: threads){
            t.join(2000);
        }

        for(int i =0;i<inputNumbers.size();i++)
        {
            Factorial t = threads.get(i);
            if(t.isFinished())
            {
                System.out.println("Thread " + t.getName() + "finished" + t.getResult());
            }else{
                System.out.println("Thread took long time to finish");
            }
        }
//
//        Factorial factorialthread =  new Factorial(5386);
//        factorialthread.start();
//
////        Thread.sleep(10000);
//        factorialthread.join();
//        System.out.println(factorialthread.getResult());
//
//
//        if(factorialthread.isFinished())
//        {
//            System.out.println("Thread is completed");
//        }else{
//            System.out.println("Calculation took too long to finnished");
//        }
//
        System.out.println("Main is completed");
    }

}
