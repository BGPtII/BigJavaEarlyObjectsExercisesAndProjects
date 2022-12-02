package chaptertwo.programmingprojects;

import java.awt.Rectangle;

/**
 * constructs a Rectangle object square representing a square with top-left corner (100, 100) and side length 200,
 * prints its location by calling System.out.println(square), applies the grow and translate methods,
 * and calls System.out.println(square) again.
 * The calls to grow and translate will modify the square so that it has
 * half the width and is centered in the original square.
 */
public class TwoPEThree {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(100, 100, 200, 200);
        System.out.println(square);

        square.grow(-50, -50);
        System.out.println(square);
    }
}
