package chapterfour.practiceexercises;

/**
 * Displays the properties of a letter-size (8.5 × 11 inches) sheet of paper in millimeters.
 * There are 25.4 millimeters per inch. Prints the width, height, perimeter & length of the diagonal
 */
public class FourPEOne {
    public static void main(String[] args) {
        double letterWidthMM = 8.5 * 25.4;
        double letterLengthMM = 11 * 25.4;
        System.out.println("Width: " + letterWidthMM + ", length: " + letterLengthMM);
        System.out.println("Perimeter: " + letterLengthMM * 2 + letterWidthMM * 2);
        double lengthOfDiagonal = Math.sqrt(letterLengthMM * letterLengthMM + letterWidthMM * letterWidthMM);
        System.out.println("Length of diagonal: " + lengthOfDiagonal);
    }
}
