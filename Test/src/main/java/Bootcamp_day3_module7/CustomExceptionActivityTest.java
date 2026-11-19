package Bootcamp_day3_module7;
public class CustomExceptionActivityTest {
    public static void main(String[] args) {
        CustomExceptionActivityTest test = new CustomExceptionActivityTest();
        try {
            test.validateUser("John");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }

        try {
            test.validateUser("Alex");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }

        try {
            test.validateUser("Stacie");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {
        // Array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (name.equals(validUsers[i])) {
                flag = 1;
            }
        }

        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else {
            System.out.println("Welcome to Payroll program");
        }
    }
}
