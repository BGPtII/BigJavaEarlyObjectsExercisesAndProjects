package chaptersix.programmingprojects.factorgenerator;

/**
 * A factor is: a number that divides a given number without any remainder (EX: 10 -> 1, 2, 5, 10)
 */
public class FactorGenerator {
    private int numberToFactor;
    private int lastAttemptedNumber;

    public FactorGenerator(int numberToFactor) {
        this.numberToFactor = numberToFactor;
        this.lastAttemptedNumber = 1;
    }

    public int nextFactor() {
        while (numberToFactor % lastAttemptedNumber != 0) {
            lastAttemptedNumber++;
        }
        return lastAttemptedNumber++; // Returns the value of lastAttemptedNumber, then increments the value by 1
    }

    public boolean hasMoreFactors() {
        return lastAttemptedNumber <= numberToFactor;
    }
}
