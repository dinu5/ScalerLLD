package producerconsumersync;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Object> store = new LinkedList<>();
        int maxsize = 6;
        Producer p1 = new Producer(store,maxsize,"p1");
        Producer p2 = new Producer(store,maxsize,"p2");
        Producer p3 = new Producer(store,maxsize,"p3");
        Producer p4 = new Producer(store,maxsize,"p4");
        Producer p5 = new Producer(store,maxsize,"p5");

        Consumer c1 = new Consumer(store,maxsize,"c1");
        Consumer c2 = new Consumer(store,maxsize,"c2");
        Consumer c3 = new Consumer(store,maxsize,"c3");
        Consumer c4 = new Consumer(store,maxsize,"c4");

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        Thread t4 = new Thread(p4);
        t4.start();
        Thread t5 = new Thread(p5);
        t5.start();

        Thread t6 = new Thread(c1);
        t6.start();
        Thread t7 = new Thread(c2);
        t7.start();
        Thread t8 = new Thread(c3);
        t8.start();
        Thread t9 = new Thread(c4);
        t9.start();
    }
}
