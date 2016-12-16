package com.stefanski;

import org.junit.Test;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
public class CalculatorTest {

    @Test
    // sum__both_positive_numbers
    public void shouldSumBothPositiveNumbers() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        assertTrue(2 == sum);
//        assertEquals(2, sum);
//        assertThat(sum, is(2));
    }
}