package ProducerConsumerSynchronization;

import java.util.Objects;
import java.util.Queue;

public class Consumer implements Runnable{

    private Queue<Object> queue;

    int maxsize;

    String name;

    Consumer(Queue<Object> queue, int maxsize, String name){
         this.queue = queue;
         this.maxsize  = maxsize;
         this.name =  name;
    }

    @Override
    public void run() {
        while(true)
        {
            synchronized (this.queue){
                if(this.queue.size() > 0)
                {
                    System.out.println("Consume : " + this.queue.size() + " " + this.name);
                    this.queue.remove();
                }
            }

        }
    }
}
