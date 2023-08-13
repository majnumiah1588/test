package test;

import java.util.Scanner;

public class CompareFirstLastLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.length() == 0) {
            System.out.println("The string is empty.");
        } else {
            char firstLetter = input.charAt(0);
            char lastLetter = input.charAt(input.length() - 1);

            if (Character.toLowerCase(firstLetter) == Character.toLowerCase(lastLetter)) {
                System.out.println("First and last letter are the same.");
            } else {
                System.out.println("First and last letter are different.");
            }
        }

        scanner.close();
    }
}

