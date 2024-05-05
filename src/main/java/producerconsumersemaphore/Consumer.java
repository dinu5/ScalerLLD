package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Queue<Object> store;
    int maxsize;
    String name;
    Semaphore consumerSemaphore;
    Semaphore producerSemaphore;
    Consumer(Queue<Object> store,int maxsize,String name,Semaphore consumerSemaphore,Semaphore producerSemaphore){
        this.store = store;
        this.maxsize = maxsize;
        this.name = name;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }
    @Override
    public void run() {
        while(true) {
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.remove();
            System.out.println("consumer "+this.name+" is consuming, max size is " + store.size());

            producerSemaphore.release();
        }
    }
}
