package chapterthree.practiceexercises;

/**
 *  Simulates a navigational current value, that can traverse by adding or removing values
 *  through a range of integers with a maximum & minimum
 */
public class RangeInput {
    private int min;
    private int max;
    private int currentValue;

    /**
     * Constructs an object with a current value set to the middle
     * @param minInt minimum integer you can navigate to
     * @param maxInt maximum integer you can navigate to
     */
    public RangeInput(int minInt, int maxInt) {
        min = minInt;
        max = maxInt;
        currentValue = (int) (min + max) / 2;
    }

    public void up() {
        currentValue = Math.min(currentValue + 1, max);
    }

    public void down() {
        currentValue = Math.max(currentValue - 1, min);
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
