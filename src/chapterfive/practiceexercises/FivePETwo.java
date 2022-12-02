package chapterfive.practiceexercises;

import java.util.Scanner;

/**
 * Reads a floating-point number; prints whether it is positive, negative, or zero.
 * Also prints "small" if the absolute value is less than 1, or "large" if it exceeds 1,000,000
 */
public class FivePETwo {
    public static void main(String[] args) {
        System.out.print("Enter a floating-point number: ");
        Scanner in = new Scanner(System.in);
        if(in.hasNextDouble()) {
            double userDouble = in.nextDouble();
            if(userDouble > 0) {
                System.out.print("Positive");
            }
            else if(userDouble < 0) {
                System.out.print("Negative");
            }
            else {
                System.out.print("Zero");
            }

            if(Math.abs(userDouble) < 1) {
                System.out.print(", small");
            }
            else if(Math.abs(userDouble) > 1000000) {
                System.out.print(", large");
            }
        }
        else {
            System.out.println("Floating-point numbers only!");
        }
    }
}
