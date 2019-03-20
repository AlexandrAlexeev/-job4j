package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexandr Alexeev (a.joy8508@gmail.com)
 * @version %Id%
 * @since 0.1
 */
public class MultiMaxTest {
    @Test
    public void whenFirstLessSecondLessThird() {
        MultiMax maxim = new MultiMax();
        int result = maxim.max(4, 2, 9);
        assertThat(result, is(9));
    }
}