package test;

import java.util.Scanner;

public class WaterStateAltitude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter C for Celsius or F for Fahrenheit: ");
        char unit = scanner.next().charAt(0);

        System.out.print("Enter the altitude value: ");
        double altitude = scanner.nextDouble();

        double convertedTemperature;

        if (unit == 'F' || unit == 'f') {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5.0 / 9.0;
        } else if (unit == 'C' || unit == 'c') {
            convertedTemperature = temperature;
        } else {
            System.out.println("Invalid unit. Please enter C or F.");
            scanner.close();
            return;
        }

        // Convert altitude to meters if it's given in feet
        if (altitude >= 0) {
            altitude = (altitude * 0.3048); // Convert feet to meters
        }

        // Adjust boiling point based on altitude
        convertedTemperature -= (altitude / 300);

        if (convertedTemperature >= 100) {
            System.out.println("Water is in the gaseous state.");
        } else if (convertedTemperature <= 0) {
            System.out.println("Water is in the solid state.");
        } else {
            System.out.println("Water is in the liquid state.");
        }

        scanner.close();
    }
}

