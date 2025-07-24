

// using swing frame solve problem 3
// grid layout
import javax.swing.*;
import java.awt.*;

public class problem_3_a_d {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout - JFrame");
        frame.setLayout(new GridLayout(3, 1));

        frame.add(new JLabel("Name:"));
        frame.add(new JTextField());
        frame.add(new JButton("Submit"));

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
