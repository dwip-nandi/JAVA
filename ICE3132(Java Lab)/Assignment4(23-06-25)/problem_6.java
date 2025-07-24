
// Write a java (GUI) simple program as following specification:  There  will  be  one  text  box,  one  
//command  button.  User  will  click  on  command  button,  the  number will increment into the textbox.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class problem_6 {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Increment Counter");
        frame.setSize(300, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create components
        JTextField textField = new JTextField("0", 10);
        JButton button = new JButton("Increment");

        // Action listener to handle increment
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(textField.getText());
                currentValue++;
                textField.setText(String.valueOf(currentValue));
            }
        });

        // Add components to frame
        frame.add(textField);
        frame.add(button);

        // Make visible
        frame.setVisible(true);
    }
}
