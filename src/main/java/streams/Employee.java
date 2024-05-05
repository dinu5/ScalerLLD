package streams;

public class Employee {
    String name;
    int salary;
    String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }

    public Employee(String name, int salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }
}
