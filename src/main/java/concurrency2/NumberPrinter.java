package concurrency2;

public class NumberPrinter implements Runnable{

    int n;
    public NumberPrinter(int i) {
        this.n = i;
    }

    @Override
    public void run() {
        System.out.println(n + "Printed by : "+Thread.currentThread().getName());
    }
}
