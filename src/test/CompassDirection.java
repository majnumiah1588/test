package test;

import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        int angle = scanner.nextInt();

        // Adjust the angle to be between 0 and 360 degrees
        angle = (angle % 360 + 360) % 360;

        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};

        int index = (int) Math.round((angle / 45.0) % 8);
        String compassDirection = directions[index];

        System.out.println("The nearest compass direction is: " + compassDirection);

        scanner.close();
    }
}

