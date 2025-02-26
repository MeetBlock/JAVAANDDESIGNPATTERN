package ProducerConsumerSynchronization;

import java.util.Queue;

public class Producer implements  Runnable{
    private Queue<Object> queue;

    int maxsize;

    String name;



    Producer(Queue<Object> queue,int maxsize, String name){
        this.queue = queue;
        this.maxsize = maxsize;
        this.name = name;
    }

    @Override
    public void run() {
      // Each producer wants to continuously
        // produces Tshirts and add them to the queue
        // if there is space available
        while(true)
        {
            synchronized (this.queue) {
                if (this.queue.size() < maxsize) {
                    System.out.println("Adding : " + this.queue.size() + " " +this.name);
                    this.queue.add(new Object());
                }
            }
        }

    }
}
