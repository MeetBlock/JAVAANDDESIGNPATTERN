package Adv;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
//        Lock lock = new ReentrantLock(true);

        Thread thread =  new Thread(()->{
            System.out.println("Inside another thread " + Thread.currentThread().getName());
        });

        thread.start();

    }
}
