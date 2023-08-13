package test;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1 for January, 2 for February, etc.): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            int days = Month.getLength(monthNumber);
            System.out.println(days + " days");
        } else {
            System.out.println("Invalid month number.");
        }

        scanner.close();
    }
}