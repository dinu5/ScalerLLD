package concurrency3;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Count count;
    Lock lock;
    Adder(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i<=10000000;i++){
            lock.lock();
            count.value++;
            lock.unlock();
        }
    }
}
