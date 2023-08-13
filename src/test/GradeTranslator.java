package test;

import java.util.Scanner;

public class GradeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String input = scanner.nextLine().toUpperCase();

        char letterGrade = input.charAt(0);
        double numericGrade = Grade.getNumericGrade(letterGrade);

        if (numericGrade >= 0) {
            if (input.length() > 1) {
                char modifier = input.charAt(1);
                if (modifier == '+') {
                    numericGrade += 0.3;
                } else if (modifier == '-') {
                    numericGrade -= 0.3;
                }
            }

            System.out.println("The numeric value is " + numericGrade);
        } else {
            System.out.println("Invalid letter grade.");
        }

        scanner.close();
    }
}