package chaptersix.programmingprojects.factorgenerator;

import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToFactor;
        boolean isNegative = false;
        System.out.println("Factor Generator");
        System.out.print("Enter an integer to find factors of: ");
        if (scanner.hasNextInt()) {
            numberToFactor = scanner.nextInt();
            if (numberToFactor < 0) {
                isNegative = true;
                numberToFactor = Math.abs(numberToFactor);
            }
            FactorGenerator fg = new FactorGenerator(numberToFactor);
            System.out.print("Factors of " + numberToFactor + ": ");
            if (numberToFactor == 0) {
                System.out.println("0 has no factors.");
            }
            else {
                while (fg.hasMoreFactors()) {
                    if (isNegative) {
                        System.out.print("-");
                    }
                    System.out.print(fg.nextFactor());
                    if (fg.hasMoreFactors()) {
                        System.out.print(", ");
                    }
                }
            }
        }
        else {
            System.out.println("Invalid: not an integer.");
        }
    }
}
