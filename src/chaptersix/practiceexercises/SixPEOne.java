package chaptersix.practiceexercises;

import java.util.Scanner;

/**
 * A program that computes:
 * the sum of all even numbers between 2 and 100 (inclusive),
 * the sum of all squares between 1 and 100 (inclusive),
 * all powers of 2 from 2^0 up to 2^20,
 * the sum of all odd numbers between a and b (inclusive), where a and b are inputs,
 * the sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
 */
public class SixPEOne {
    public static void main(String[] args) {
        System.out.println("The sum of all even numbers between 2 and 100 (inclusive): ");
        int evenSum = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println(evenSum + "\n");

        System.out.println("The sum of all squares between 1 and 100 (inclusive)");
        int squareSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i * i <= 100) {
                squareSum += i * i;
            }
            else {
                break;
            }
            i++;
        }
        System.out.println(squareSum + "\n");

        System.out.println("All powers of 2 from 2^0 up to 2^20");
        for (int i = 0; i <= 20; i++) {
            System.out.print((int) (Math.pow(2, i)) + " ");
        }
        System.out.println("\n");

        System.out.println("the sum of all odd numbers between a and b (inclusive), where a and b are inputs");
        Scanner in = new Scanner(System.in);
        boolean aValid = false;
        boolean bValid = false;
        int a = 0;
        int b = 0;
        while (!aValid || !bValid) {
            if (!aValid) {
                System.out.print("Enter integer a: ");
                try { a = in.nextInt(); aValid = true; }
                catch(Exception e) { in.next(); }
            }
            if (!bValid) {
                System.out.print("Enter integer b: ");
                try { b = in.nextInt(); bValid = true; }
                catch(Exception e) { in.next(); }
            }
            if (a > b) {
                aValid = false;
                bValid = false;
            }
        }
        int oddSum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        System.out.println("a: " + a + ", b: " + b + ", odd sum: " + oddSum + "\n");

        System.out.println("The sum of all odd digits of an input. (For example, if the input is 32677, " +
                "the sum would be 3 + 7 + 7 = 17.");
        int inputOddSum = 0;
        boolean validInput = true;
        while (validInput) {
            System.out.print("Enter an integer (any other characters to quit):  ");
            try {
                int currentValue = in.nextInt();
                if (currentValue % 2 != 0) {
                    inputOddSum += currentValue;
                }
            }
            catch(Exception e) { validInput = false; }
        }
        System.out.println("Odd input sum: " + inputOddSum);
    }
}
