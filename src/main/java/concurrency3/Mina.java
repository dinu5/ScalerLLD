package concurrency3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mina {
    public static void main(String[] args) {
        Count count = new Count(0);
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count,lock);
        Subtracter subtracter = new Subtracter(count,lock);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtracter);
        t1.start();
        t2.start();
        System.out.println(count.value);
    }
}
