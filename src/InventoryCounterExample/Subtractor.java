package InventoryCounterExample;

import java.util.concurrent.locks.Lock;

public class Subtractor implements  Runnable{

    private InventoryCounter counter;
    private Lock lock;
    public  Subtractor(InventoryCounter counter,Lock lock){
        this.counter = counter;
        this.lock = lock;

    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            lock.lock();
            this.counter.count--;
            lock.unlock();
        }
    }
}
