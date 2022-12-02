package chaptertwo.practiceexercises;

import java.awt.Rectangle;

/**
 * Constructs 2 Rectangle objects, the 1st with an area of 42 & the 2nd with a perimeter of 42
 * Uses the getWidth & getHeight methods to obtain the appropriate values
 */
public class TwoPEFive {
    public static void main(String[] args) {
        Rectangle rectArea42 = new Rectangle(6, 7);
        System.out.println("rectArea42 width: " + rectArea42.getWidth() + ", height: " + rectArea42.getHeight());

        Rectangle rectPerim42 = new Rectangle(5, 16);
        System.out.println("rectPerim42 width: " + rectPerim42.getWidth() + ", height: " + rectPerim42.getHeight());
    }
}
