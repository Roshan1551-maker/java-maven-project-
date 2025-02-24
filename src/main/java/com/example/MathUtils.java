package com.example;

public class MathUtils {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers with zero-check handling
    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Handling division by zero case
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        System.out.println("Addition: " + mathUtils.add(5, 3));
        System.out.println("Subtraction: " + mathUtils.subtract(10, 4));
        System.out.println("Multiplication: " + mathUtils.multiply(6, 2));
        System.out.println("Division: " + mathUtils.divide(9, 3));
        System.out.println("Division by Zero: " + mathUtils.divide(10, 0));
    }
}
