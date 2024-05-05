package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Object> store;
    int maxsize;
    String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Producer(Queue<Object> store,int maxsize,String name,Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.store = store;
        this.maxsize = maxsize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while(true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.add(new Object());
            System.out.println("producer " + this.name + " is producing, max size is " + store.size());
            maxsize++;
            consumerSemaphore.release();
        }
    }
}
