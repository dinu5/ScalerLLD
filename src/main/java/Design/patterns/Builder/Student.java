package Design.patterns.Builder;

public class Student {
    String name;
    int age;
    String phone;
    String email;
    int rollNumber;
    String collegeName;

    private Student(){};
    public Student(StudentBuilder builder){
        if(builder.getAge()<25){
            throw new RuntimeException("Kids are not allowed");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.phone = builder.getPhone();
        this.email = builder.getEmail();
    }
}
