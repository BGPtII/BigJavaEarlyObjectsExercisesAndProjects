package chaptersix.practiceexercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Read a sequence of integer inputs from a user and prints:
 * the smallest and largest of the inputs,
 * the number of even and odd inputs,
 * cumulative totals (EX: 1 7 2 9, the program should print 1 8 10 19),
 * all adjacent duplicates (EX: 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6)
 */
public class IntegerSequenceInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInts = new ArrayList<>();

        while (true) {
            System.out.print("Enter an integer (\"done\" to display integer data): ");
            if (scanner.hasNext("done")) {
                break;
            }
            else if (scanner.hasNextInt()) {
                userInts.add(scanner.nextInt());
            }
            else {
                System.out.println("Only integers accepted!");
                scanner.next();
            }
        }

        if (userInts.isEmpty()) {
            System.out.println("No integers entered, therefore no data available.");
        }
        else {
            int smallestInt = userInts.get(0);
            int largestInt = userInts.get(0);
            int evenCount = 0;
            int oddCount = 0;
            int cumulativeTotal = 0;
            ArrayList<Integer> cumulativeTotalArrayList = new ArrayList<>();
            ArrayList<Integer> adjacentDuplicates = new ArrayList<>();
            Integer previousInt = null;
            for (int currentInt : userInts) {
                // Determine adjacent duplicates
                if (previousInt != null && previousInt.equals(currentInt) && !adjacentDuplicates.contains(currentInt)) {
                    adjacentDuplicates.add(currentInt);
                }
                previousInt = currentInt;
                // Add to cumulativeTotalArrayList
                cumulativeTotal += currentInt;
                cumulativeTotalArrayList.add(cumulativeTotal);
                // Determine largestInt & smallestInt integers
                if (currentInt > largestInt) {
                    largestInt = currentInt;
                }
                if (currentInt < smallestInt) {
                    smallestInt = currentInt;
                }
                // Determine even & odd integer count
                if (currentInt % 2 == 0) {
                    evenCount++;
                }
                else {
                    oddCount++;
                }
            }
            System.out.println("Integer Data: " + userInts);
            System.out.println("Largest Integer: " + largestInt);
            System.out.println("Smallest Integer: " + smallestInt);
            System.out.println("Total even numbers: " + evenCount);
            System.out.println("Total odd numbers: " + oddCount);
            System.out.println("Cumulative totals: " + cumulativeTotalArrayList);
            System.out.println("Adjacent duplicates: " + adjacentDuplicates);
        }
    }
}
