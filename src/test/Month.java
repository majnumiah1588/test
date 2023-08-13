package test;

class Month {
    public static int getLength(int monthNumber) {
        switch (monthNumber) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}

