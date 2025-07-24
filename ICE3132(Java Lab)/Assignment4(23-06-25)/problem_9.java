
// Write a java (GUI) program for temperature converter (Fahrenheit to Celsius). 
//  There will be a text box, user will enter a number. 
//  There will be another text box that will show the conversion result. 
//  There will be a command button where user will click for the conversion result.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class problem_9 {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Fahrenheit to Celsius Converter");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel labelF = new JLabel("Fahrenheit:");
        JTextField textF = new JTextField(10);

        JLabel labelC = new JLabel("Celsius:");
        JTextField textC = new JTextField(10);
        textC.setEditable(false); // Make output field read-only

        JButton convertBtn = new JButton("Convert");

        // Add action listener to button
        convertBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(textF.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    textC.setText(String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    textC.setText("Invalid input");
                }
            }
        });

        // Add components to frame
        frame.add(labelF);
        frame.add(textF);
        frame.add(labelC);
        frame.add(textC);
        frame.add(convertBtn);

        // Display the frame
        frame.setVisible(true);
    }
}
