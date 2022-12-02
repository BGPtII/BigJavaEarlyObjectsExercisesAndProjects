package chaptertwo.programmingprojects;

import java.awt.Rectangle;

/**
 * Constructs a Rectangle object, translates and prints it three more times, so that, if the rectangles were drawn,
 * they would form one large rectangle
 * Prints the location of these 4 rectangles
 */
public class TwoPEOne {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(20, 40);
        System.out.println(box);
        box.translate(20, 0);
        System.out.println(box);
        box.translate(0, -40);
        System.out.println(box);
        box.translate(-20, 0);
        System.out.println(box);
    }
}
