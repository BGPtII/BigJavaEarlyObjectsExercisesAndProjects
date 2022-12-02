package chapterfour.programmingprojects;

import java.util.Scanner;

/**
 * Reads the initial balance and the annual interest rate (interest is compounded monthly).
 * Prints out the balances after the first three months
 */
public class FourPPEleven {
    public static void main(String[] args) {
        boolean validBalance = false;
        boolean validInterest = false;
        double initialBalance = 0;
        double interestRate = 0;
        Scanner in = new Scanner(System.in);
        while (!validBalance || !validInterest) {
            if (!validBalance) {
                System.out.print("Enter the initial balance: ");
                try { initialBalance = in.nextDouble(); validBalance = true; }
                catch(Exception e) { in.next(); }
            }
            if (!validInterest) {
                System.out.print("Enter the interest rate percentage (just the number): ");
                try { interestRate = in.nextDouble(); validInterest = true; }
                catch(Exception e) { in.next(); }
            }
        }
        System.out.println("Initial balance: " + initialBalance);
        System.out.println("Annual interest rate in percent: " + initialBalance);
        double updatedBalance = (interestRate / 100 + 1) * initialBalance;
        System.out.printf("After first month: %8.2f%n", updatedBalance);
        updatedBalance *= interestRate / 100 + 1;
        System.out.printf("After second month: %7.2f%n", updatedBalance);
        updatedBalance *= interestRate / 100 + 1;
        System.out.printf("After third month: %8.2f%n", updatedBalance);
    }
}
