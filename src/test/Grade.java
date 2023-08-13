package test;

class Grade {
    public static double getNumericGrade(char letterGrade) {
        switch (letterGrade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            case 'F':
                return 0.0;
            default:
                return -1.0; // Invalid grade
        }
    }
}
