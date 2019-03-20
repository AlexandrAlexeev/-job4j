package ru.job4j.condition;

/**
 *  @author Alexandr Alexeev (a.joy8508@gmail.com)
 *  @version %Id%
 *  @since 0.1
 */

public class MultiMax {
    /**
     * Determining the maximum of two numbers.
     * @param first Number 1.
     * @param second Number 2.
     * @return Result
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Determining the maximum of three numbers.
     * @param first Number 1.
     * @param second Number 2.
     * @param third Number 3.
     * @return Result.
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}