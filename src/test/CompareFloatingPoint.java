package test;

import java.util.Scanner;

public class CompareFloatingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two floating-point numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Round the numbers to two decimal places
        num1 = Math.round(num1 * 100) / 100.0;
        num2 = Math.round(num2 * 100) / 100.0;

        if (num1 == num2) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }

        scanner.close();
    }
}
