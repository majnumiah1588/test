package test;

class GetLetterGrade {
    public static char getLetterGrade(double numericGrade) {
        if (numericGrade >= 3.85) {
            return 'A';
        } else if (numericGrade >= 3.5) {
            return 'A';
        } else if (numericGrade >= 3.15) {
            return 'B';
        } else if (numericGrade >= 2.85) {
            return 'B';
        } else if (numericGrade >= 2.5) {
            return 'C';
        } else if (numericGrade >= 2.15) {
            return 'C';
        } else if (numericGrade >= 1.85) {
            return 'D';
        } else if (numericGrade >= 1.5) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
