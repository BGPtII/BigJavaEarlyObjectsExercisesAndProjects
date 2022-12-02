package chaptersix.programmingprojects;

import java.util.Scanner;

/**
 * Prompts the user for an integer n and prints the nth Fibonacci number, using the above algorithm
 */
public class SixPETwo {
    public static void main(String[] args) {
        boolean nValid = false;
        int n = 0;
        Scanner in = new Scanner(System.in);
        while (!nValid) {
            System.out.print("Enter an integer greater than 0: ");
            try {
                n = in.nextInt();
                if (n > 0) {
                    nValid = true;
                }
            }
            catch(Exception e) { in.next(); }
        }

        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;
        if (n == 2 || n == 3) {
            fnew = 1;
        }
        else if (n >= 4) {
            for (int i = 4; i <= n; i++) {
                fnew = fold1 + fold2;
                fold2 = fold1;
                fold1 = fnew;
            }
        }

        System.out.println("The nth Fibonacci sequence value is: " + fnew);
    }
}
