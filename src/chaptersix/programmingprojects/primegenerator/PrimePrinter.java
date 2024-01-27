package chaptersix.programmingprojects.primegenerator;

import java.util.Scanner;

public class PrimePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime Numbers Printer");
        System.out.print("Enter a number to display the prime numbers up to & including: ");
        if (scanner.hasNextInt()) {

        }
        else {
            System.out.println("Invalid input: ");
        }
    }
}
