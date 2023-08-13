package test;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three strings: ");
        String[] strings = scanner.nextLine().split(" ");

        Arrays.sort(strings);

        System.out.println("Sorted strings: " + String.join(" ", strings));

        scanner.close();
    }
}
