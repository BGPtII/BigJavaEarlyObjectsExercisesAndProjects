package chaptertwo.programmingprojects;

import java.awt.Rectangle;

public class TwoPETwo {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(100, 100, 50, 50);
        System.out.println(square);

        square.translate(25, 25);
        square.grow(25, 25);
        System.out.println(square);
    }
}
