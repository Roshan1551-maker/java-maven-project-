package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(8, mathUtils.add(5, 3));
        assertEquals(-2, mathUtils.add(-5, 3));
        assertEquals(0, mathUtils.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, mathUtils.subtract(10, 4));
        assertEquals(-8, mathUtils.subtract(-5, 3));
        assertEquals(0, mathUtils.subtract(5, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, mathUtils.multiply(6, 2));
        assertEquals(-15, mathUtils.multiply(-5, 3));
        assertEquals(0, mathUtils.multiply(0, 10));
    }

    @Test
    public void testDivide() {
        assertEquals(3.0, mathUtils.divide(9, 3), 0.001);
        assertEquals(2.5, mathUtils.divide(5, 2), 0.001);
        assertEquals(-1.0, mathUtils.divide(10, 0), 0.001); // Test for division by zero
    }
}

