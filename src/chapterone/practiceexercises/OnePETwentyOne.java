package chapterone.practiceexercises;

/**
 * Uses 2 columns to display the English to French translation of 4 common phrases
 * Uses data from Google Translate
 */
public class OnePETwentyOne {
    public static void main(String[] args) {
        System.out.printf("%s %62s\n", "English", "French");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-61s %s", "Good morning.", "Bonjour.\n");
        System.out.printf("%-33s %s", "It is a pleasure to meet you.", "C'est un plaisir de vous rencontrer.\n");
        System.out.printf("%-43s %s", "Please call me tomorrow.", "Veuillez m'appeler demain.\n");
        System.out.printf("%-44s %s", "Have a nice day!", "Passez une bonne journée!");
    }
}
