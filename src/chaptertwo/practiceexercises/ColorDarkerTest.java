package chaptertwo.practiceexercises;

import java.awt.Color;

/**
 * Applies the darker method on the Color.RED object
 */
public class ColorDarkerTest {
    public static void main(String[] args) {
        System.out.println("Before: " + Color.RED);
        System.out.println("After: " + Color.RED.darker().darker());
    }
}
