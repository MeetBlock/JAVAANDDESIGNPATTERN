package AtomicDatatypeDemo;

import AtomicDatatypeDemo.Adder;
import AtomicDatatypeDemo.Subtractor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        InventoryCounter invcounter =  new InventoryCounter();

        Thread t1 =  new Thread(new Adder(invcounter));
        Thread t2 =  new Thread(new Subtractor(invcounter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(invcounter.counter.get());
    }
}
