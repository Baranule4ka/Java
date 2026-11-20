package module10;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid input: division by zero is not allowed");
            return 0;
        }
    }

    public int multiply(int a, int b) {
        try {
            validate(a, b);
            return a * b;
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    private void validate(int a, int b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Invalid input: negative numbers are not allowed");
        }
    }
}