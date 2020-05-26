package ru.job4j.array;

/**
 * Square
 * @author Alexandr Alexeev (a.joy8508@gmail.com)
 * @version $Id$
 * @since 0.1 
 */
public class Square {

    /**
     * Массив с числами возведенными в квадрат от 1 до bound.
     * @param bound число до которого возводить в квадрат.
     * @return массив с числами возведенными в квадрат.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}