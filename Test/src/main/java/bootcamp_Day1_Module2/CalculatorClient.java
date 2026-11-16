
package bootcamp_Day1_Module2;
import bootcamp_Day1.Calculator;
public class CalculatorClient {

    public static void main(String[] args) {

        // Create Calculator using Basic type constant
        Calculator normalCalc =
                new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using "
                + normalCalc.getCalculatorType()
                + " calculator ***");

        // Add
        int result = normalCalc.add(4, 5);
        System.out.println("1) Add result is " + result);

        // Multiply
        int[] mul = {2, 3, 4};

        int multiplicationResult = normalCalc.multiply(mul);
        System.out.println("2) Multiply result is "
                + multiplicationResult);

        // Divide
        int divisionResult = normalCalc.divide(10, 2);
        System.out.println("3) Divide result is " + divisionResult);

        // Subtract
        int subtractionResult = normalCalc.subtract(10, 2);
        System.out.println("4) Subtract result is " + subtractionResult);
    }
}
