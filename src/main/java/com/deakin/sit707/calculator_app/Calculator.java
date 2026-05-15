package com.deakin.sit707;

public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);  
    
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("=== Calculator Application - SIT707 ===");
        System.out.println("Student ID: s225616844");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("20 / 5 = " + calc.divide(20, 5));
    }
}