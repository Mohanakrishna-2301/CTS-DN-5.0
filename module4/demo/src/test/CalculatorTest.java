package module4.demo.src.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import module4.demo.src.main.Calculator;

public class CalculatorTest 
{
    @Test
    public void testAdd() 
    {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() 
    {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() 
    {
        Calculator calc = new Calculator();
        int result = calc.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void testDivide() 
    {
        Calculator calc = new Calculator();
        int result = calc.divide(20, 4);
        assertEquals(5, result);
    }
}
