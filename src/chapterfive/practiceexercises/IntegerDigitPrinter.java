package chapterfive.practiceexercises;

import java.util.Scanner;

/**
 * Reads an integer and prints how many digits the number has, by checking whether the number is ≥ 10, ≥ 100, and so on.
 * (Assume that all integers are less than ten billion.) If the number is negative, first multiply it with –1
 */
public class IntegerDigitPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInteger = 0;
        do {
            System.out.println("Enter an integer that isn't zero (\"q\" to quit: ");
            if (scanner.hasNext("q")) {
                System.exit(0);
            }
            if (scanner.hasNextInt()) {
                userInteger = scanner.nextInt();
            }
            else {
                scanner.next();
            }
        }
        while (userInteger == 0);
    }
}
