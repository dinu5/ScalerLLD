package Design.patterns.Builder;

public class Student {
    String name;
    int age;
    String phone;
    String email;
    int rollNumber;
    String collegeName;

    private Student(){};

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
    public Student(StudentBuilder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.phone = builder.getPhone();
        this.email = builder.getEmail();
    }

}
