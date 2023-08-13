package test;

import java.util.Scanner;

public class NumberClassification_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.print("positive");
        } else {
            System.out.print("negative");
        }

        double absoluteValue = Math.abs(number);
        if (absoluteValue < 1) {
            System.out.println(" small");
        } else if (absoluteValue > 1000000) {
            System.out.println(" large");
        } else {
            System.out.println();
        }

        scanner.close();
    }
}
