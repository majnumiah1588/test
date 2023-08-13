package test;

import java.util.Scanner;

public class CheckOrderWithMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mode (strict/lenient): ");
        String mode = scanner.nextLine().toLowerCase();

        if (!mode.equals("strict") && !mode.equals("lenient")) {
            System.out.println("Invalid mode entered. Exiting.");
            return;
        }

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        boolean increasing;
        boolean decreasing;

        if (mode.equals("strict")) {
            increasing = num1 < num2 && num2 < num3;
            decreasing = num1 > num2 && num2 > num3;
        } else {
            increasing = num1 <= num2 && num2 <= num3;
            decreasing = num1 >= num2 && num2 >= num3;
        }

        if (increasing) {
            System.out.println("The numbers are in " + mode + " increasing order.");
        } else if (decreasing) {
            System.out.println("The numbers are in " + mode + " decreasing order.");
        } else {
            System.out.println("The numbers are neither in " + mode + " increasing nor " + mode + " decreasing order.");
        }

        scanner.close();
    }
}
