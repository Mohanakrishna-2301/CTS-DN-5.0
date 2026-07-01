package com.junitbasic;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest 
{
    private Calculator calc;

    @Before
    public void setUp() 
    {
        calc = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    @Test
    public void testAddUsingAAA() 
    {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtractUsingAAA() 
    {
        // Arrange
        int a = 20;
        int b = 8;

        // Act
        int result = calc.subtract(a, b);

        // Assert
        assertEquals(12, result);
    }

    @After
    public void tearDown() 
    {
        calc = null;
        System.out.println("Teardown: Calculator object destroyed");
    }
}
