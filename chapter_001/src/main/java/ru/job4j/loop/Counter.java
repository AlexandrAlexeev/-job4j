package ru.job4j.loop;

/**
 * Class counter
 * @author Alexandr Alexeev (a.joy8508@gmail.com)
 * @version %Id%
 * @since 0.1
 */
public class Counter {
    /**
     * Sum of even numbers
     * @param start Start value;
     * @param finish End value (inclusive)
     * @return Sum
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}