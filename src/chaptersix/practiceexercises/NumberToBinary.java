package chaptersix.practiceexercises;

import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder binaryConversion = new StringBuilder();
        System.out.print("Enter any number: ");
        if (scanner.hasNextDouble()) {
            String userNumber = Double.toString(scanner.nextDouble());
            // Split decimal number into 2 separate numbers (2 sides of the decimal)
            String[] parts = userNumber.split("\\."); // "\\" escape sequence in regex syntax
            int integerPart = Integer.parseInt(parts[0]);
            int decimalPart = Integer.parseInt(parts[1]);

            if (integerPart == 0 && decimalPart == 0) {
                binaryConversion.append(0);
            }
            else if (integerPart != 0) {
                if (integerPart < 0) {
                    binaryConversion.append("-");
                    integerPart = Math.abs(integerPart);
                }
                while (integerPart != 0) {
                    binaryConversion.append(integerPart % 2);
                    integerPart /= 2;
                }
                if (decimalPart != 0) {
                    binaryConversion.append(".");
                    while (decimalPart != 0) {
                        binaryConversion.append(decimalPart % 2);
                        decimalPart /= 2;
                    }
                }
            }
            System.out.println("Converted binary: " + binaryConversion);
        }
        else {
            System.out.println("Only numbers accepted!");
        }
    }
}
