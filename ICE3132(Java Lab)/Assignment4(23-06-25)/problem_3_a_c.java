
// using swing frame solve problem 3
// border layout
import javax.swing.*;
import java.awt.*;

public class problem_3_a_c {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout - JFrame");
        frame.setLayout(new BorderLayout());

        frame.add(new JLabel("Name:"), BorderLayout.NORTH);
        frame.add(new JTextField(), BorderLayout.CENTER);
        frame.add(new JButton("Submit"), BorderLayout.SOUTH);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
