package Design.patterns.Builder;

//public class StudentBuilder {
//    String name;
//    int age;
//    String phone;
//    String email;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public int getRollNumber() {
//        return rollNumber;
//    }
//
//    public String getCollegeName() {
//        return collegeName;
//    }
//
//    int rollNumber;
//    String collegeName;
//
//
//    public StudentBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public StudentBuilder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public StudentBuilder setPhone(String phone) {
//        this.phone = phone;
//        return this;
//    }
//
//    public StudentBuilder setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public StudentBuilder setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//        return this;
//    }
//
//    public StudentBuilder setCollegeName(String collegeName) {
//        this.collegeName = collegeName;
//        return this;
//    }
//    public Student build(){
//        if(this.getAge()<25){
//            throw new RuntimeException("Kids are not allowed");
//        }
//        return new Student(this);
//    }
//}
