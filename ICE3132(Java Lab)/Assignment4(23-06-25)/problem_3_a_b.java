// using swing frame solve problem 3
// Flow layout
import javax.swing.*;
import java.awt.*;

public class problem_3_a_b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout - JFrame");
        frame.setLayout(new FlowLayout());

        frame.add(new JLabel("Name:"));
        frame.add(new JTextField(15));
        frame.add(new JButton("Submit"));

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
