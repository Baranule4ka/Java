package module10;

public class AbstractActivity {

    public static void main(String[] args) {
        Employee employee = new Employee("Shawn Cun", 32, "Developer", "Accenture", 70000.00);
        Student student = new Student("Anna Smith", 21, "University of Latvia");

        // 2.3.1 Call introduce from employee
        employee.introduce();

        // 2.3.2 Call introduce from student
        student.introduce();
    }
}