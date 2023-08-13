package test;

import java.util.Scanner;

public class CompareHalfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int length = word.length();
        int halfLength = length / 2;

        String firstHalf = word.substring(0, halfLength);
        String secondHalf = word.substring(length % 2 == 0 ? halfLength : halfLength + 1);

        if (firstHalf.equalsIgnoreCase(secondHalf)) {
            System.out.println("First and second half are the same.");
        } else {
            System.out.println("First and second half are different.");
        }

        scanner.close();
    }
}
