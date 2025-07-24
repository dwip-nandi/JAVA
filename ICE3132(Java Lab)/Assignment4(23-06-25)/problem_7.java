// Write a java (GUI) simple program as following specification:  There will be two commands (Red and Green). 
// If user clicks on Red button red color will display on the frame and if clicks on Green button green color will 
// display on the frame

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class problem_7 {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");

        // Add action listeners
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.GREEN);
            }
        });

        // Add buttons to frame
        frame.add(redButton);
        frame.add(greenButton);

        // Make frame visible
        frame.setVisible(true);
    }
}
