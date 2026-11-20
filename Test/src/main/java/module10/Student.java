package module10;

public class Student extends Person {

    private String schoolName;


    public Student() {
    }

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        System.out.println("I am study in university " + schoolName);
    }
}