package module10;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {

    private static final List<Employee> ALL_EMPLOYEES = new ArrayList<>();

    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String name, int age, String jobTitle, String company, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
        ALL_EMPLOYEES.add(this);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    public static String getHighestPaidEmp() {
        Employee highestPaid = null;
        for (Employee employee : ALL_EMPLOYEES) {
            if (highestPaid == null || employee.getSalary() > highestPaid.getSalary()) {
                highestPaid = employee;
            }
        }
        if (highestPaid == null) {
            return "No employees";
        }
        return highestPaid.getName();
    }
}