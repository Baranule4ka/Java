package module10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private static final double DELTA = 0.0001;

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAddIntegers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddNegativeIntegers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testAddDoubles() {
        assertEquals(5.5, calculator.add(2.2, 3.3), DELTA);
    }

    @Test
    public void testAddNegativeDoubles() {
        assertEquals(-1.0, calculator.add(-1.5, 0.5), DELTA);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(6.0, calculator.subtract(10, 4), DELTA);
    }

    @Test
    public void testSubtractNegativeResult() {
        assertEquals(-2.0, calculator.subtract(3, 5), DELTA);
    }


    @Test
    public void testDivideValidInput() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0, calculator.divide(10, 0));
    }

    @Test
    public void testMultiplyValidInput() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    public void testMultiplyLargerNumbers() {
        assertEquals(42, calculator.multiply(7, 6));
    }

    @Test
    public void testMultiplyInvalidInput() {
        assertEquals(0, calculator.multiply(-3, 5));
    }

    @Test
    public void testInvalidInputExceptionMessage() {
        InvalidInputException exception = new InvalidInputException("test message");
        assertEquals("test message", exception.getMessage());
    }
}