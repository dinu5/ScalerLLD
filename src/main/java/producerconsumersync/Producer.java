package producerconsumersync;

import java.util.Queue;

public class Producer implements Runnable{
    Queue<Object> store;
    int maxsize;
    String name;
    Producer(Queue<Object> store,int maxsize,String name){
        this.store = store;
        this.maxsize = maxsize;
        this.name = name;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if (store.size() < maxsize) {
                    store.add(new Object());
                    System.out.println("producer "+this.name+" is producing, max size is " + store.size());
                    maxsize++;
                }
            }
        }
    }
}
