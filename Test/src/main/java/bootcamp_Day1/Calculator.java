
package bootcamp_Day1;
public class Calculator {
    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";
        public Calculator() {
        this.calculatorType = CALC_TYPE_BASIC;
    }
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }
    // Getter
    public String getCalculatorType() {
        return calculatorType;
    }
    // Setter
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }
    // Add
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
    // Subtract
    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }
    // Multiply all numbers in an array
    public int multiply(int[] numbers) {
        int temp = 1;

        for (int number : numbers) {
            temp = temp * number;
        }

        return temp;
    }
    // Divide
    public int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int divValue = x / y;
        return divValue;
    }
}
