package org.example;

public class DinoTest {
    static String name = "Dino";
    public void method1(){
        name = "jj";
        System.out.println(name);
    }

    public static void main(String[] args) {
        DinoTest d = new DinoTest();
        d.method1();
    }
}
