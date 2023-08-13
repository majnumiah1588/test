package test;

import java.util.Scanner;
public class NumberToLetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric grade between 0 and 4: ");
        double numericGrade = scanner.nextDouble();

        if (numericGrade >= 0 && numericGrade <= 4) {
            char letterGrade = GetLetterGrade.getLetterGrade(numericGrade);
            System.out.println("The closest letter grade is: " + letterGrade);
        } else {
            System.out.println("Invalid numeric grade.");
        }

        scanner.close();
    }
}
