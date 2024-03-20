package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Dog> list = new ArrayList<>();
        doSomething(list);

        List<Animal> listAnimals = new ArrayList<>();
        doSomething2(listAnimals);
    }
    public static void doSomething(List<? extends Animal> list){

    }
    public static void doSomething2(List<? super Dog> list){

    }
}
