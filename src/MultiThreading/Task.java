package MultiThreading;

public class Task implements  Runnable{
    @Override
    public void run() {
        // here business logic will be written which needs to be run concurrently
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
