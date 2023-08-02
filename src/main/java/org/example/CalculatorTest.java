package org.example;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What you want to calculate? +, -, * or /");
        char choice = sc.next().charAt(0);
        System.out.println("Write a number:");
        double a = sc.nextDouble();
        System.out.println("Write another number:");
        double b = sc.nextDouble();
        double result;
        switch (choice){
            case '+':
                result = sum(a, b);
                System.out.println(a+ " + " +b+ " = " +result);
                break;
            case '-':
                result = sub(a, b);
                System.out.println(a+ " - " +b+ " = " +result);
                break;
            case '*':
                result = mult(a, b);
                System.out.println(a+ " * " +b+ " = " +result);
                break;
            case '/':
                result = div(a, b);
                System.out.println(a+ " / " +b+ " = " +result);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static double sub(double a, double b){
        return a - b;
    }
    public static double mult(double a, double b){
        return a * b;
    }
    public static double div(double a, double b){
        return a / b;
    }
}
