package module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Smith", 30, "Developer", "Accenture", 3500.00);
        Employee employee2 = new Employee("Anna Taylor", 28, "Tester", "Accenture", 4200.00);
        Employee employee3 = new Employee("Mike Brown", 41, "Architect", "Accenture", 5200.00);
        Employee employee4 = new Employee("Emma White", 25, "Analyst", "Accenture", 3900.00);
        Employee employee5 = new Employee("David Green", 35, "Manager", "Accenture", 4800.00);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

        System.out.println("The Employee whose salary is the highest is :" + Employee.getHighestPaidEmp());
    }
}