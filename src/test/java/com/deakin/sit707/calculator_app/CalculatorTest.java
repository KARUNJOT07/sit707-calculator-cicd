package com.deakin.sit707;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAddition() {
        assertEquals(8, calculator.add(5, 3), "5 + 3 should equal 8");
    }
    
    @Test
    public void testSubtraction() {
        assertEquals(6, calculator.subtract(10, 4), "10 - 4 should equal 6");
    }
    
    @Test
    public void testMultiplication() {
        assertEquals(42, calculator.multiply(6, 7), "6 * 7 should equal 42");
    }
    
    @Test
    public void testDivision() {
        assertEquals(4.0, calculator.divide(20, 5), 0.001, "20 / 5 should equal 4.0");
    }
    
    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        }, "Division by zero should throw IllegalArgumentException");
    }
    
    @Test
    public void testPower() {
        // THIS TEST WILL FAIL - intentional bug in Calculator.power()
        assertEquals(8, calculator.power(2, 3), "2^3 should equal 8");
    }
    
    @Test
    public void testPowerWithZeroExponent() {
        // THIS TEST WILL ALSO FAIL - same bug
        assertEquals(1, calculator.power(5, 0), "Any number^0 should equal 1");
    }
}