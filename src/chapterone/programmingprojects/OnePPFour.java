package chapterone.programmingprojects;

import java.util.Scanner;

/**
 * Asks the user for their restaurant bill & tip amount
 * Splits the total restaurant bill between a number of friends
 * Prints the restaurant bill, the tip (15%) & total cost.
 * Also prints what each person pays, and their part of the tip
 */
public class OnePPFour {
    public static void main(String[] args) {
        double bill = 0;
        double tip = 0;
        int numPeople = 0;
        boolean billValid = false;
        Scanner in = new Scanner(System.in);
        while (!billValid || numPeople == 0) {
            if (!billValid) {
                System.out.print("Enter the restaurant bill total: ");
                try { bill = in.nextDouble(); billValid = true; }
                catch (Exception e) { in.next(); }
            }
            if (numPeople == 0) {
                System.out.print("Enter the number of people splitting the bill: ");
                try { numPeople = in.nextInt(); }
                catch (Exception e) { in.next(); }
            }
        }
        System.out.println();
        System.out.printf("The restaurant bill is $%.2f%n", bill);
        tip = 0.15 * bill;
        System.out.printf("The tip total is $%.2f%n", tip);
        System.out.printf("Each person pays $%.2f for the restaurant bill%n", bill / numPeople);
        System.out.printf("Each person pays $%.2f for their part of the tip%n", tip / numPeople);

    }
}
