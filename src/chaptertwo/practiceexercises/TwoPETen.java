package chaptertwo.practiceexercises;

import java.awt.Color;

/**
 *  constructs a Color object with red, green, and blue values of 50, 100, and 150,
 *  then applies the brighter method of the Color class,
 *  prints the red, green, and blue values of the resulting color
 */
public class TwoPETen {
    public static void main(String[] args) {
        Color c = new Color(50, 100, 150);
        c = c.brighter();
        System.out.println(c);
    }
}
