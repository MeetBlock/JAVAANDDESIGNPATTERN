package InventoryCountSynchronized;

import java.util.concurrent.locks.Lock;

public class Adder implements  Runnable{

    private InventoryCounter counter;
    public Adder(InventoryCounter counter){
        this.counter = counter;

    }


    @Override
    public void run(){
        // Add to the counter 1000 times

        for(int i=1;i<=1000;i++)
        {
            this.counter.increment();
//            synchronized (counter){
//                this.counter.count++;
//            }
        }
    }
}
