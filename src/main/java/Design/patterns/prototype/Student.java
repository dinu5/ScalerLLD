package Design.patterns.prototype;

public class Student implements Prototype{
    String name;
    String batchName;
    String phone;
    String email;
    double batchAvgPSP;
    String instructorName;

    public Student(){

    }
    public Student(Student student){
        this.name = student.name;
        this.batchName = student.batchName;
        this.phone = student.phone;
        this.email = student.email;
        this.batchAvgPSP = student.batchAvgPSP;
        this.instructorName = student.instructorName;
    }

    public Student clone(){
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBatchAvgPSP() {
        return batchAvgPSP;
    }

    public void setBatchAvgPSP(double batchAvgPSP) {
        this.batchAvgPSP = batchAvgPSP;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
