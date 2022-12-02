package chaptertwo.practiceexercises;

/**
 * Calls the reverse method on a StringBuilder object
 */
public class TwoPENine {
    public static void main(String[] args) {
        StringBuilder testString = new StringBuilder("Testing!!!");
        System.out.println("Before: \"" + testString + "\"");
        testString.reverse();
        System.out.println("After: \"" + testString + "\"");
    }
}
