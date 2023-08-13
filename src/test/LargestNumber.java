package test;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largestNumber = Math.max(num1, Math.max(num2, num3));

        System.out.println("The largest number is " + largestNumber);

        scanner.close();
    }
}

