package chaptersix.practiceexercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads a set of floating-point values; asks the user to enter the values (prompting only a single time for the values), then prints:
 * the average of the values, the smallest of the values, the largest of the values, the range (the difference between the smallest and largest)
 */
public class DataSet {
    private ArrayList<Double> numbers;

    public DataSet() {
        numbers = new ArrayList<>();
    }

    public void add(double value) {
        numbers.add(value);
    }

    public double getSmallest() {
        double smallest = numbers.get(0);
        for (double currentInt : numbers) {
            if (currentInt < smallest) {
                smallest = currentInt;
            }
        }
        return smallest;
    }

    public double getLargest() {
        double largest = numbers.get(0);
        for (double currentInt : numbers) {
            if (currentInt > largest) {
                largest = currentInt;
            }
        }
        return largest;
    }

    public double getAverage() {
        double sum = 0;
        for (double currentInt : numbers) {
            sum += currentInt;
        }
        return sum / numbers.size();
    }

    public double getRange() {
        return getLargest() - getSmallest();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet main = new DataSet();
        while (true) {
            System.out.print("Enter a number (\"done\" to print number information): ");
            if (scanner.hasNext("done")) {
                break;
            }
            else if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                main.add(input);
            }
            else {
                System.out.println("Enter numbers only!");
                scanner.next();
            }
        }

        System.out.println("User-entered numbers: " + main.numbers);
        System.out.println("Average: " + main.getAverage());
        System.out.println("Smallest: " + main.getSmallest());
        System.out.println("Largest: " + main.getLargest());
        System.out.println("Range: " + main.getRange());
    }
}
