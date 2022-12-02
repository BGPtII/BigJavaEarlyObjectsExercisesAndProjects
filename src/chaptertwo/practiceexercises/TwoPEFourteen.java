package chaptertwo.practiceexercises;

import java.util.Random;

/**
 * Prints a random price between $10.00 & $19.95
 */
public class TwoPEFourteen {
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.printf("$%.2f", generator.nextDouble(10.00, 19.96));
    }
}
