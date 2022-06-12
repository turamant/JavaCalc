package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void add() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(result, 5);
    }

    @Test
    public void sub() {
        Calculator calc = new Calculator();
        int result = calc.sub(10, 10);
        assertEquals(result, 0);
    }

    @Test
    public void mul() {
        Calculator calc = new Calculator();
        int result = calc.mul(-5, -3);
        assertEquals(result, 15);
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        int result = calc.div(2, 3);
        assertEquals(result, 0);
    }
}
