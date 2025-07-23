import javax.swing.*;

public class SwingFrameDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("My First GUI Frame");
        f.setSize(400, 300);                         // set width and height
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // enable close button
        f.setVisible(true);                          // make frame visible
    }
}
