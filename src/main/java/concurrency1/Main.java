package concurrency1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world printed by "+Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();
        Thread t2 = new Thread(helloWorldPrinter);
        t2.start();
        Thread t3 = new Thread(helloWorldPrinter);
        t3.start();
        Thread t4 = new Thread(helloWorldPrinter);
        t4.start();
        System.out.println("Hello world printed by "+Thread.currentThread().getName());
    }
}
