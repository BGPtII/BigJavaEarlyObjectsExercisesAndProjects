package chapterthree.practiceexercises;

/**
 * Tests the RangeInput class' methods
 */
public class ThreePEThree {
    public static void main(String[] args) {
        RangeInput tempControl = new RangeInput(60, 80);
        System.out.println(tempControl.getCurrentValue());
        System.out.println("Expected: 70");
        tempControl.up();
        System.out.println(tempControl.getCurrentValue());
        System.out.println("Expected: 71");

        for (int i = 0; i < 10; i++) {
            tempControl.up();
            System.out.print(tempControl.getCurrentValue() + " ");
        }
        System.out.println();
        System.out.println("Expected values: 72, 73, 74, 75, 76, 77, 78, 79, 80, 80");

        for (int i = 0; i < 22; i++) {
            tempControl.down();
            System.out.print(tempControl.getCurrentValue() + " ");
        }
        System.out.println();
        System.out.println("Expected values: 79, 78, 77, 76, 75, 74... 63, 62, 61, 60, 60, 60");
    }
}
