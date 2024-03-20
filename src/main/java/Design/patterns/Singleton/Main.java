package Design.patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        MySingleton mySingleton1 = MySingleton.getInstance();
        MySingleton mySingleton2 = MySingleton.getInstance();
        MySingleton mySingleton3 = MySingleton.getInstance();
        System.out.println(mySingleton1);
        System.out.println(mySingleton2);
        System.out.println(mySingleton3);
    }
}
