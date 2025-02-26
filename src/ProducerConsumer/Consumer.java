package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Object> queue;

    int maxsize;

    String name;

    Semaphore producerSemaphore;

    Semaphore consumerSemaphore;

    Consumer(Queue<Object> queue, int maxsize, String name,Semaphore producerSemaphore,Semaphore consumerSemaphore){
         this.queue = queue;
         this.maxsize  = maxsize;
         this.name =  name;
         this.producerSemaphore = producerSemaphore;
         this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                this.consumerSemaphore.acquire();
                if(this.queue.size() > 0)
                {
                    System.out.println("Consume : " + this.queue.size() + " " + this.name);
                    this.queue.remove();
                }
                this.producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
