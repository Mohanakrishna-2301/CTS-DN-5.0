package com.exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest 
{
    CalculatorService service = new CalculatorService();

    @Test
    void testAdd() 
    {
        int result = service.add(10,20);
        assertEquals(30,result);
    }
}
