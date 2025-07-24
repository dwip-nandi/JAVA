
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleCalculator {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel label1 = new JLabel("Number 1:");
        JTextField text1 = new JTextField(10);

        JLabel label2 = new JLabel("Number 2:");
        JTextField text2 = new JTextField(10);

        JLabel resultLabel = new JLabel("Result: ");
        
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");

        // Add action listeners
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(text1.getText());
                    double num2 = Double.parseDouble(text2.getText());
                    double result = 0;

                    String op = e.getActionCommand();
                    switch (op) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/": 
                            if (num2 == 0) {
                                resultLabel.setText("Result: Cannot divide by zero");
                                return;
                            }
                            result = num1 / num2; 
                            break;
                    }
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Result: Invalid input");
                }
            }
        };

        // Attach listener to all buttons
        addButton.addActionListener(action);
        subButton.addActionListener(action);
        mulButton.addActionListener(action);
        divButton.addActionListener(action);

        // Add components to frame
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);

        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);

        frame.add(resultLabel);

        // Display frame
        frame.setVisible(true);
    }
}
