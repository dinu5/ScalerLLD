package Design.patterns.ConceptCrossChecking;

public class Main {
    public static void main(String[] args) {
        CheckStaatic obj1 = new CheckStaatic();
        obj1.setName("Dino");
        obj1.setAge(26);
        obj1.setUnivName("Techno India");
        System.out.println(obj1);
        CheckStaatic obj2 = new CheckStaatic();
        obj2.setName("Ayushee");
        obj2.setAge(23);
        obj1.setUnivName("Scaler");
        System.out.println("After changing");
        System.out.println(obj2);
        System.out.println(obj1);
    }
}
