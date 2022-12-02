package chaptertwo.practiceexercises;

/**
 * Encodes the string "Mississippi" by replacing the letters "i" with "!" and all letters "s" with "$"
 * Prints the expected and actual value of the string after these changes
 */
public class TwoPESeven {
    public static void main(String[] args) {
    String mississippi = "Mississippi";
    mississippi = mississippi.replace("i", "!");
    mississippi = mississippi.replace("s", "$");
    System.out.println("Expected: M!$$!$$!pp!, actual: " + mississippi);
    }
}
