public class Calculator {

    // Basic Operations
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulo by zero is not allowed.");
        }
        return a % b;
    }

    public int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Negative exponents are not supported.");
        }
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Advanced Operations
    public int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed for GCD.");
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("LCM requires positive integers.");
        }
        return Math.abs(a * b) / gcd(a, b);
    }

    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci number cannot be calculated for negative index.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
