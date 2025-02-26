package AtomicDatatypeDemo;

public class Adder implements Runnable{
    private InventoryCounter ic;

    Adder(InventoryCounter ic){
        this.ic = ic;

    }

    @Override
    public void run() {
        for(int i=0 ;i<=1000;i++)
        {
            this.ic.counter.addAndGet(1);
        }
    }
}
