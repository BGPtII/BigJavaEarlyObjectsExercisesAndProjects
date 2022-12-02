package chapterfive.practiceexercises;

import java.util.Scanner;

/**
 * Reads an integer and prints whether it is positive, negative, or zero
 */
public class FivePEOne {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt()) {
            int userInt = in.nextInt();
            if(userInt > 0) {
                System.out.println("Integer is positive.");
            }
            else if(userInt < 0) {
                System.out.println("Integer is negative.");
            }
            else {
                System.out.println("Integer is zero.");
            }
        }
        else {
            System.out.println("Integers only!");
        }
    }
}
