package ru.job4j.loop;

/**
 * n-Factorial calculator.
 * @author Alexandr Alexeev (a.joy8508@gmail.com)
 * @version %Id%
 * @since 0.1
 */
public class Factorial {
    /**
     * Calculation of n-Factorial
     * @param n End value (inclusive)
     * @return n-Factorial
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}