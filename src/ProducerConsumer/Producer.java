package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{
    private Queue<Object> queue;

    int maxsize;

    String name;

    Semaphore producerSemaphore;

    Semaphore consumerSemaphore;



    Producer(Queue<Object> queue,int maxsize, String name,Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.queue = queue;
        this.maxsize = maxsize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
      // Each producer wants to continuously
        // produces Tshirts and add them to the queue
        // if there is space available
        while(true)
        {
            try {
                this.producerSemaphore.acquire();
                if (this.queue.size() < maxsize) {
                    System.out.println("Adding : " + this.queue.size() + " " +this.name);
                    this.queue.add(new Object());
                }
                this.consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
