// using swing frame solve problem 3
// default layout
import javax.swing.*;

public class problem_3_a_a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Default Layout - JFrame");

        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Submit");

        frame.add(label, "North");
        frame.add(textField, "Center");
        frame.add(button, "South");

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
