package com.example;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Is Positive (10): " + calculator.isPositive(a));
        System.out.println("Is Positive (-5): " + calculator.isPositive(-5));
    }
}
