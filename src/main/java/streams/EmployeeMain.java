package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList();
        Employee emp1 = new Employee("Dino",2000,"Bangalore");
        Employee emp2 = new Employee("Anay",2000,"Hyderabad");
        Employee emp3 = new Employee("Shipra",2000,"Pune");
        Employee emp4 = new Employee("Kshitij",2000,"Bangalore");
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        Map<String,List<Employee>> empMap = list.stream().collect(Collectors.groupingBy(Employee :: getLocation));
        empMap.forEach((key,value)-> System.out.println(key +" : "+value));
    }
}
