import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // Test for basic operations
    @Test
    public void testAddition() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }

    @Test
    public void testModulo() {
        assertEquals(1, calculator.modulo(10, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModuloByZero() {
        calculator.modulo(10, 0);
    }

    @Test
    public void testPower() {
        assertEquals(27, calculator.power(3, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeExponentPower() {
        calculator.power(2, -3);
    }

    // Test for advanced operations
    @Test
    public void testGCD() {
        assertEquals(5, calculator.gcd(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGCDWithNegativeNumber() {
        calculator.gcd(-10, 5);
    }

    @Test
    public void testLCM() {
        assertEquals(15, calculator.lcm(5, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLCMWithZero() {
        calculator.lcm(0, 3);
    }

    @Test
    public void testFibonacci() {
        assertEquals(13, calculator.fibonacci(7));
    }

    @Test
    public void testFibonacciZero() {
        assertEquals(0, calculator.fibonacci(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFibonacci() {
        calculator.fibonacci(-5);
    }
}
