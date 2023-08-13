package test;

import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter C for Celsius or F for Fahrenheit: ");
        char unit = scanner.next().charAt(0);

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

