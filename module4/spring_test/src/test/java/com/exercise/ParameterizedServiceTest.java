package com.exercise;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedServiceTest
{
    CalculatorService calculator = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "2,3,5",
            "10,20,30",
            "50,50,100",
            "100,200,300"})

    void testAddition(int a, int b, int expected)
    {
        assertEquals(expected,calculator.add(a,b));
    }
}
