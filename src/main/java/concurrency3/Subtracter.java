package concurrency3;

import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{
    Count count;
    Lock lock;
    public Subtracter(Count count,Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i<=10000000;i++){
            synchronized (count) {
                count.value--;
            }
        }
    }
}
