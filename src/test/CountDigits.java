package test;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int absoluteValue = Math.abs(number);
        int digitCount = 0;

        if (absoluteValue == 0) {
            digitCount = 1;  // Special case for handling 0
        } else {
            int temp = absoluteValue;
            while (temp > 0) {
                temp /= 10;
                digitCount++;
            }
        }

        if (number < 0) {
            System.out.println("The absolute value of the number is: " + absoluteValue);
        }

        System.out.println("The number has " + digitCount + " digit(s).");

        scanner.close();
    }
}

