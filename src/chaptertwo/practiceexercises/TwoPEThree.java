package chaptertwo.practiceexercises;
import java.awt.Rectangle;

/**
 * Constructs a Rectangle object, prints its expected and actual area
 */
public class TwoPEThree {
    public static void main(String[] args) {
        Rectangle testRect = new Rectangle(20, 40);
        int testRectArea = testRect.height * testRect.width;
        System.out.println("Expected area: 800");
        System.out.println("Actual area: " + testRectArea);
    }
}
