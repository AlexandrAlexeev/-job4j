package ru.job4j;

/**
 * Class Max, задача "4.2. Максимум из двух чисел".
 * @author Alexandr Alexeev (a.joy8508@gmail.com)
 * @since 0.1
 * @version $Id%
 */
public class Max {

	/**
     * Максимум из двух целых чисел.
	 * Если числа равные, возвращает первое число.
     * @param first - первое сравниваемое.
     * @param second - второе сравниваемое.
	 * @return Наибольшее из двух чисел
     */
	public int max(int first, int second) {
		return (first >= second) ? first : second;
	}

	/**
     * Максимум из трех целых чисел.
     * @param first - первое сравниваемое.
     * @param second - второе сравниваемое.
	 * @param third - третье сравниваемое.
	 * @return Наибольшее из трех чисел
     */
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}

}