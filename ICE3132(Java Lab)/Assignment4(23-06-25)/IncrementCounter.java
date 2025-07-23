import javax.swing.*;
import java.awt.event.*;

public class IncrementCounter {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Increment Counter");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Text field
        JTextField textField = new JTextField("0");
        textField.setBounds(50, 30, 100, 30);
        frame.add(textField);

        // Button
        JButton incrementButton = new JButton("Increment");
        incrementButton.setBounds(160, 30, 100, 30);
        frame.add(incrementButton);

        // Button click action
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(textField.getText());
                    value++;
                    textField.setText(String.valueOf(value));
                } catch (NumberFormatException ex) {
                    textField.setText("0"); // reset if not a number
                }
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
