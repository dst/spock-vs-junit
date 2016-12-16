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
    // TODO: change name
    public void shouldSumBothPositiveNumbers() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        assertTrue(2 == sum);
        // TODO: assertEquals, assertThat
//        assertEquals(2, sum);
//        assertThat(sum, is(2));
    }
}