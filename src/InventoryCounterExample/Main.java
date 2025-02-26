package InventoryCounterExample;

import java.util.concurrent.locks.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        InventoryCounter counter =  new InventoryCounter();
        Lock lock = new ReentrantLock();

        System.out.println(counter.count);

        Thread t1 =  new Thread(new Adder(counter,lock));
        Thread t2 =  new Thread(new Subtractor(counter,lock));
        t1.start();
        t2.start();

        t1.join();
//        System.out.println(counter.count);

        t2.join();
        System.out.println(counter.count);
    }
}
