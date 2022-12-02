package chaptertwo.practiceexercises;

/**
 * A demonstration of the trim method on Strings, showing which spaces are removed
 */
public class TwoPETwo {
    public static void main(String[] args) {
        String trimTest = "   Testing!   Wow!";
        System.out.println("Before trim method: " + trimTest);
        System.out.println("After trim method: " + trimTest.trim());
        System.out.println();

        trimTest = "...OnePEEighteen!     ";
        System.out.println("Before trim method: " + trimTest + " Trim removes the leading spaces.");
        System.out.println("After trim method: " + trimTest.trim() + " Trim removes the leading spaces.");
        System.out.println();

        trimTest = "     ...aaaaaaa...     ";
        System.out.println("Before trim method: " + trimTest + " Trim removes the leading spaces.");
        System.out.println("After trim method: " + trimTest.trim() + " Trim removes the leading spaces.");
    }
}
