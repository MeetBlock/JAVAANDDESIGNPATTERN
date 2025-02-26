package AtomicDatatypeDemo;

public class Subtractor implements Runnable {

    private InventoryCounter ic;
    Subtractor(InventoryCounter ic){
        this.ic = ic;
    }

    @Override
    public void run() {
        for(int i =0;i<=1000;i++)
        {
            this.ic.counter.addAndGet(-1);
        }
    }
}
