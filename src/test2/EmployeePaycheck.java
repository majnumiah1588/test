package test2;

import java.util.Scanner;

public class EmployeePaycheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = scanner.nextDouble();

        Paycheck paycheck = new Paycheck(employeeName, hourlyWage, hoursWorked);
        paycheck.printPaycheck();

        scanner.close();
    }
}
