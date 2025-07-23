import javax.swing.*;
import java.awt.event.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Fahrenheit to Celsius Converter");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Input Label
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        labelFahrenheit.setBounds(30, 30, 100, 25);
        frame.add(labelFahrenheit);

        // Input TextField
        JTextField textFahrenheit = new JTextField();
        textFahrenheit.setBounds(140, 30, 200, 25);
        frame.add(textFahrenheit);

        // Output Label
        JLabel labelCelsius = new JLabel("Celsius:");
        labelCelsius.setBounds(30, 70, 100, 25);
        frame.add(labelCelsius);

        // Output TextField
        JTextField textCelsius = new JTextField();
        textCelsius.setBounds(140, 70, 200, 25);
        textCelsius.setEditable(false);  // Make it read-only
        frame.add(textCelsius);

        // Convert Button
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(140, 110, 100, 30);
        frame.add(convertButton);

        // Button Action
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(textFahrenheit.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    textCelsius.setText(String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                }
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
