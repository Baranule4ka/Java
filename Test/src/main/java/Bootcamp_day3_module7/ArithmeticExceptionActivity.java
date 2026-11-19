package Bootcamp_day3_module7;
public class ArithmeticExceptionActivity {
    public static void main(String[] args) {
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        System.out.println("Call with 10 and 0:");
        obj.catchMe(10, 0);
        System.out.println("-----------------------------");
        System.out.println("Call with 10 and 2:");
        obj.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! You cannot divide a number by zero.");
        } finally {
            System.out.println("Thank you for using this program.");
        }
    }
}