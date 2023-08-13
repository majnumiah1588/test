package test;

import java.util.Scanner;

public class CheckMatchingPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        if ((num1 == num2 && num3 == num4) || (num1 == num3 && num2 == num4) || (num1 == num4 && num2 == num3)) {
            System.out.println("The input consists of two matching pairs.");
        } else {
            System.out.println("The input does not consist of two matching pairs.");
        }

        scanner.close();
    }
}

