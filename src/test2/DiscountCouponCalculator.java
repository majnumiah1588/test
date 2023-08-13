package test2;

import java.util.Scanner;

public class DiscountCouponCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the cost of your groceries: $");
        double groceriesCost = scanner.nextDouble();

        double discountPercentage = 0.08; // 8% discount
        double discountCoupon = groceriesCost * discountPercentage;

        System.out.printf("You win a discount coupon of $ %.2f. (%.0f%% of your purchase)%n", discountCoupon, discountPercentage * 100);

        scanner.close();
    }
}

