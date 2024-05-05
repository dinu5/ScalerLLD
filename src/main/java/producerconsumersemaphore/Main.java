package producerconsumersemaphore;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Object> store = new ArrayDeque<>();
        int maxsize = 6;
        Semaphore producerSemaphore = new Semaphore(6);
        Semaphore consumerSemaphore = new Semaphore(0);
        Producer p1 = new Producer(store,maxsize,"p1",producerSemaphore,consumerSemaphore);
        Producer p2 = new Producer(store,maxsize,"p2",producerSemaphore,consumerSemaphore);
        Producer p3 = new Producer(store,maxsize,"p3",producerSemaphore,consumerSemaphore);
//        Producer p4 = new Producer(store,maxsize,"p4",producerSemaphore,consumerSemaphore);
//        Producer p5 = new Producer(store,maxsize,"p5",producerSemaphore,consumerSemaphore);

        Consumer c1 = new Consumer(store,maxsize,"c1",consumerSemaphore,producerSemaphore);
        Consumer c2 = new Consumer(store,maxsize,"c2",consumerSemaphore,producerSemaphore);
        Consumer c3 = new Consumer(store,maxsize,"c3",consumerSemaphore,producerSemaphore);
//        Consumer c4 = new Consumer(store,maxsize,"c4",consumerSemaphore,producerSemaphore);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
//        Thread t4 = new Thread(p4);
//        t4.start();
//        Thread t5 = new Thread(p5);
//        t5.start();

        Thread t6 = new Thread(c1);
        t6.start();
        Thread t7 = new Thread(c2);
        t7.start();
        Thread t8 = new Thread(c3);
        t8.start();
//        Thread t9 = new Thread(c4);
//        t9.start();
    }
}
