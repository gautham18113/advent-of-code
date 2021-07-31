package com.adventofcode;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

import com.adventofcode.Day1;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void day1Test() {
        Day1 d = new Day1();

        int[] arr = { 1991, 20, 2000, 91, 9, 20, 1992 };

        int[] res = d.sum2020(arr);

        assertTrue(res[0] * res[1] == 40000);

    }
}
