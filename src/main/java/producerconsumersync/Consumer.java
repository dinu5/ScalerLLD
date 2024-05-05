package producerconsumersync;

import java.util.Queue;

public class Consumer implements Runnable{
    Queue<Object> store;
    int maxsize;
    String name;
    Consumer(Queue<Object> store,int maxsize,String name){
        this.store = store;
        this.maxsize = maxsize;
        this.name = name;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if (store.size() > 0) {
                    store.remove();
                    System.out.println("consumer "+this.name+" is consuming, max size is " + store.size());
                    maxsize--;
                }
            }
        }
    }
}
