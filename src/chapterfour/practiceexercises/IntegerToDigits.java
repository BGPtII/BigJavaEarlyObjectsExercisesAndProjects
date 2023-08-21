package chapterfour.practiceexercises;

import java.util.Scanner;

/**
 * Gets an integer from the user, then prints the individual digits
 * Integer must be positive & less than 6 digits
 * EX: 16384 is displayed as "1 6 3 8 4"
 */
public class IntegerToDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        do {
            System.out.print("Enter a positive integer less than 6 digits (\"q\" to quit): ");
            if (scanner.hasNext("q")) {
                System.exit(0);
            }
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
            }
            else {
                scanner.next();
            }
        }
        while (userNumber <= 0 || userNumber >= 100000);

        String userDigits = Integer.toString(userNumber);
        System.out.print("Your digits: ");
        for (int i = 0; i < userDigits.length(); i++) {
            System.out.print(userDigits.charAt(i) + " ");
        }
    }
}
