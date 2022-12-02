package chapterfive.programmingprojects;

import java.util.Scanner;

/**
 * Reads in the x- and y-coordinates of two corner points of a rectangle and then prints out
 * whether the rectangle is a square, or is in “portrait” or “landscape” orientation.
 */
public class FivePPSix {
    public static void main(String[] args) {
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        boolean x1Valid = false;
        boolean y1Valid = false;
        boolean x2Valid = false;
        boolean y2Valid = false;
        Scanner in = new Scanner(System.in);
        while (!x1Valid || !y1Valid || !x2Valid || !y2Valid) {
            if (!x1Valid) {
                System.out.print("Enter the x coordinate of the 1st corner (can be a decimal): ");
                try { x1 = in.nextDouble(); x1Valid = true; }
                catch(Exception e) { in.next(); }
            }
            if (!y1Valid) {
                System.out.print("Enter the y coordinate of the 1st corner (can be a decimal): ");
                try { y1 = in.nextDouble(); y1Valid = true; }
                catch (Exception e) { in.next(); }
            }
            if (!x2Valid) {
                System.out.print("Enter the x coordinate of the 2nd corner (can be a decimal): ");
                try { x2 = in.nextDouble(); x2Valid = true; }
                catch (Exception e) { in.next(); }
            }
            if (!y2Valid) {
                System.out.print("Enter the y coordinate of the 2nd corner (can be a decimal): ");
                try { y2 = in.nextDouble(); y2Valid = true; }
                catch (Exception e) { in.next(); }
            }
        }

        if (Math.abs(x1 - x2) > Math.abs(y1 - y2)) {
            System.out.println("Landscape orientation");
        }
        else if (Math.abs(x1 - x2) < Math.abs(y1 - y2)) {
            System.out.println("Portrait orientation");
        }
        else {
            System.out.println("Square orientation");
        }

    }
}
