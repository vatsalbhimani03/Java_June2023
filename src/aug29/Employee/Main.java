package aug29.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Vatsal", 22));
        employeeList.add(new Employee("Jennifer", 70));
        employeeList.add(new Employee("Tulsi", 21));
        employeeList.add(new Employee("Sachin", 27));
        employeeList.add(new Employee("John", 31));
        employeeList.add(new Employee("Peter", 45));

        System.out.println(employeeList);

    }
}
