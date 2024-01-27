package chaptersix.programmingprojects.primegenerator;

/**
 * Prime number is: a number that can only be divided by 1 & itself without any remainders
 */
public class PrimeGenerator {
    private int primeNumber;
    private int currentNumber;

    public PrimeGenerator(int primeNumber) {
        this.primeNumber = primeNumber;
        this.currentNumber = 1;
    }

    public int nextPrime() {
        return 0;
    }

    public boolean isPrime() {
        for (int i = 1; i <= currentNumber; i++) {
            if (currentNumber / i == 0 && (i != 1 || i != currentNumber)) {
                return false;
            }
        }
        return true;
    }
}
