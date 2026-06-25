package module4.demo.src.test;

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
        // Runs before each test
        calc = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    @After
    public void tearDown() 
    {
        // Runs after each test
        calc = null;
        System.out.println("Teardown: Calculator object destroyed");
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
}
