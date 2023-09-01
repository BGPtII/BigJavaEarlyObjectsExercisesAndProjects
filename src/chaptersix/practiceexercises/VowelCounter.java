package chaptersix.practiceexercises;

import java.util.Scanner;

/**
 * Counts the vowels in a String
 * Vowels consist of: a, e, i, o, u
 */
public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vowelCount = 0;
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine().toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Total vowel count: " + vowelCount);
    }
}
