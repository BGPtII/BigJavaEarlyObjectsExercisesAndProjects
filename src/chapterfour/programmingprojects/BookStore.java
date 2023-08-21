package chapterfour.programmingprojects;

import java.util.Scanner;

/**
 * Computes the price of an order from the total price and the number of the books that were ordered
 * Tax is 7.5% of the total book price, shipping charge is $2 per book
 * The price of the order is the sum of: the total book price, the tax, and the shipping charge.
 */
public class BookStore {
    public static void main(String[] args) {
        int numBooks = 0;
        double totalBookPrice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            if (numBooks <= 0) {
                System.out.print("Enter number of books ordered (\"q\" to quit): ");
                if (scanner.hasNext("q")) {
                    System.exit(0);
                }
                if (scanner.hasNextInt()) {
                    numBooks = scanner.nextInt();
                }
                else {
                    scanner.next();
                }
            }
            if (totalBookPrice <= 0) {
                System.out.print("Enter total price of books (\"q\" to quit): ");
                if (scanner.hasNext("q")) {
                    System.exit(0);
                }
                if (scanner.hasNextDouble()) {
                    totalBookPrice = scanner.nextDouble();
                }
                else {
                    scanner.next();
                }
            }
        }
        while (numBooks <= 0 || totalBookPrice <= 0);

        double totalCalculatedPrice = totalBookPrice + (0.075 * totalBookPrice) + (2 * numBooks);
        System.out.printf("Total price is: $%.2f", totalCalculatedPrice);
    }
}
