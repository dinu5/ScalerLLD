package Design.patterns.Builder;

import javax.swing.plaf.BorderUIResource;

public class Client {
    public static void main(String[] args) {
//        StudentBuilder builder = Student.getBuilder();
//        builder.setName("Dino");
//        builder.setAge(22);
//        builder.setEmail("dino@gmail.com");
//        builder.setPhone("9932790074");
//        builder.setCollegeName("Scaler");
//        Student student1 = new Student(builder);

        Student.StudentBuilder builder = Student.getBuilder();
        Student student = builder.setName("Dino")
                                 .setAge(26)
                                 .setEmail("ishita@gmail.com")
                                 .setPhone("99999")
                                 .setCollegeName("BB College")
                                 .build();

        System.out.println("DEBUG POINT");
    }
}
