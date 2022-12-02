package chaptertwo.programmingprojects;

import java.awt.Rectangle;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 * Visually shows the translate method of the Rectangle class
 */
public class TwoPEFive {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Rectangle box = new Rectangle(200, 500);
        frame.setBounds(box);

        JOptionPane.showMessageDialog(frame, "Click OK to continue");

        box.translate(50, 50);
        frame.setBounds(box);
    }
}
