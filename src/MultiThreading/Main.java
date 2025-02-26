package MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        // How do i create a new thread

        Thread t1 =  new Thread(new Task());
        t1.start();

        Thread t2 =  new Thread(new Task());
        t2.start();

        System.out.println("We are done");

    }
}
