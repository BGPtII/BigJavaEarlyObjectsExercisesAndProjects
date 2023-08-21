package chapterfive.practiceexercises;

import java.util.Scanner;

/**
 * A supermarket awards coupons depending on how much a customer spends on groceries; the criteria is as follows:
 * Less than $10 - No coupon
 * From $10 to $60 - 8%
 * More than $60 to $150 - 10%
 * More than $150 to $210 - 12%
 * More than $210 - 14%
 */
public class SupermarketCoupon {
    public static void main(String[] args) {
        double groceryCost = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("PLease enter the cost of your groceries: ");
            if (scanner.hasNextDouble()) {
                groceryCost = scanner.nextDouble();
            }
            else {
                System.out.println("Numbers only.");
                scanner.next();
            }
        } while (groceryCost == 0);

        double couponDiscount = 0;
        if (groceryCost > 210) {
            couponDiscount = 0.14;
        }
        else if (groceryCost > 150 && groceryCost <= 210) {
            couponDiscount = 0.12;
        }
        else if (groceryCost > 60 && groceryCost <= 150) {
            couponDiscount = 0.1;
        }
        else if (groceryCost > 10 && groceryCost <= 60) {
            couponDiscount = 0.08;
        }

        if (couponDiscount == 0) {
            System.out.println("$0 worth of groceries means no coupon.");
        }
        else {
            System.out.printf("You win a discount coupon of $%.2f. (%d%% of your purchase)", couponDiscount * groceryCost, (int) (couponDiscount * 100));
        }
    }
}
