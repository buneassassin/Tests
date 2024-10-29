package com.primerp.tests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertTrue(2 == 2);
    }
    @Test
    public void testRestart() {
        assertNotNull(5);
    }
    @Test
    public void testFailure() {
        assertFalse(2 == 1);
    }
    @Test
    public void testMultiple() {
        assertNotNull( 2 * 2);
    }
    @Test
    public void testDivision() {
        assertEquals(1, 1/1);
    }
    @Test
    public void testSubtraction() {
        assertNotEquals(1, 2);
    }
    @Test
    public void testAdditionNegativeNumbers() {
        assertEquals(-2, 5 - 7);
    }
    @Test
    public void testSubtractionNegativeNumbers() {
        assertEquals(3, 3*1);
    }
    @Test
    public void testStringAddition() {
        assertEquals("Hola ", "Hola ");
    }
    @Test
    public void testArrayCompare() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
       assertArrayEquals(array1, array2);
    }





}