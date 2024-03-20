package Design.patterns.Builder;

public class StudentBuilder {
    String name;
    int age;
    String phone;
    String email;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getCollegeName() {
        return collegeName;
    }

    int rollNumber;
    String collegeName;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
