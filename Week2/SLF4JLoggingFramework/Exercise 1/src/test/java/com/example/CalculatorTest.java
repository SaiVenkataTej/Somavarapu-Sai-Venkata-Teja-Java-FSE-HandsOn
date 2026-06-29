package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }
}
