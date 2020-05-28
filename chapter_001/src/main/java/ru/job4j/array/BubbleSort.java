package ru.job4j.array;


/**
 * BubbleSort.
 * @author Alexandr Alexeev (a.joy8508@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    int[] array;

    public int[] sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}