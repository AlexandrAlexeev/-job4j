package ru.job4j.array;

/**
 * Проверяет массив заполнен true и false.
 * @author Alexandr Alexeev (a.joy8508@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Check {

    /**
     * Проверяет массив заполнен true и false.
     * @param data массив для проверки.
     * @return все элементы true или все элементы false.
     */
    public boolean mono(boolean[] data) {
        if (data.length > 0) {
            boolean checked = data[0];
            for (int i = 1; i < data.length; i++) {
                if (checked != data[i]) {
                    return false;
                }
            }
        }
        return true;
    }

}