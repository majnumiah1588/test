import java.util.*;

public class PowerCalculator {
    public double pow(double x, int n) {
        if (n == 0) {
            return 1.0; // base^0 = 1
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double halfPow = pow(x, n / 2);
        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return halfPow * halfPow * x;
        }
    }

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        Scanner in = new Scanner(System.in);

        double base = in.nextDouble();
        int power = in.nextInt();
        double result = calculator.pow(base, power);
        System.out.println(base + " raised to the power of " + power + " is: " + result);
    }
}
