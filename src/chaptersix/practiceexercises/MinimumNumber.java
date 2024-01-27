package chaptersix.practiceexercises;

import java.util.Scanner;

/**
 * Finds the minimum value from a set of user-entered numbers
 */
public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        double smallest = 0;
        while (true) {
            System.out.print("Enter a number (\"done\" to finish): ");
            if (scanner.hasNext("done")) {
                break;
            }
            else if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                if (first) {
                    smallest = input;
                    first = false;
                }
                else {
                    if (input < smallest) {
                        smallest = input;
                    }
                }
            }
            else {
                System.out.println("Enter numbers only!");
                scanner.next();
            }
        }
        System.out.println("Smallest number: " + smallest);
    }
}
