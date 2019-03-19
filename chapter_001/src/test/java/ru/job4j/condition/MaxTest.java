package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexandr Alexeev (a.joy8508@gmail.com)
 * @version %Id%
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecondLessThird() {
        Max maxim = new Max();
        int result = maxim.max(4, 2, 9);
        assertThat(result, is(9));
    }
}