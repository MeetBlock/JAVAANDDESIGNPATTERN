package FunctionalProgramming;

public class ThreadLambdaDemo {
    public static void main(String[] args) {
        System.out.println("Hello from " + Thread.currentThread().getName());

        // Passed lambda expression to thread constructor
        Thread t =  new Thread(() ->{
            System.out.println("Inside the run method");
            System.out.println("Hello from " + Thread.currentThread().getName());
        });
        t.setName("Mythread");
        t.start();
    }
}
