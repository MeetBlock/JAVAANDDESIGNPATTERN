package InventoryCountSynchronized;

import java.util.concurrent.locks.Lock;

public class Subtractor implements  Runnable{

    private InventoryCounter counter;
    public  Subtractor(InventoryCounter counter){
        this.counter = counter;

    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            this.counter.decrement();
//            synchronized (counter){
//                this.counter.count--;
//            }
        }
    }
}
