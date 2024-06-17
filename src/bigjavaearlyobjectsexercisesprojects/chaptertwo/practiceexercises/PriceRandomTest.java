package bigjavaearlyobjectsexercisesprojects.chaptertwo.practiceexercises;

import java.util.Random;

/**
 * Prints a random price between $10.00 and $19.95
 */
public class PriceRandomTest {
    public static void main(String[] args) {
        Random generator = new Random();
        double price = 10.00 + generator.nextDouble() * (19.95 - 10.00);
        System.out.printf("$%.2f", price);
    }
}