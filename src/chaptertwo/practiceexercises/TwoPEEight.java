package chaptertwo.practiceexercises;

/**
 * Switches the letters "e" and "o" in the string "Hello, World!"
 */
public class TwoPEEight {
    public static void main(String[] args) {
        String holleWorld = "Hello, World!";
        System.out.println("Before: \"" + holleWorld + "\"");
        holleWorld = holleWorld.replace("He", "Ho");
        holleWorld = holleWorld.replace("lo", "le");
        System.out.println("After: \"" + holleWorld + "\"");
    }
}
