import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverterWithMenu {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // ===== MenuBar Section =====
        JMenuBar menuBar = new JMenuBar();

        // Create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        // Create MenuItems
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add items to menus
        helpMenu.add(aboutItem);
        fileMenu.add(exitItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // Set the menu bar
        frame.setJMenuBar(menuBar);

        // ===== Output Label for MenuItem result =====
        JLabel outputLabel = new JLabel("Select an option from menu...");
        outputLabel.setBounds(20, 10, 400, 25);
        frame.add(outputLabel);

        // About item action
        aboutItem.addActionListener(e -> outputLabel.setText("This app converts Fahrenheit to Celsius."));
        
        // Exit item action
        exitItem.addActionListener(e -> System.exit(0));

        // ===== Temperature Converter Section =====
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitLabel.setBounds(30, 50, 100, 25);
        frame.add(fahrenheitLabel);

        JTextField fahrenheitField = new JTextField();
        fahrenheitField.setBounds(150, 50, 200, 25);
        frame.add(fahrenheitField);

        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusLabel.setBounds(30, 90, 100, 25);
        frame.add(celsiusLabel);

        JTextField celsiusField = new JTextField();
        celsiusField.setBounds(150, 90, 200, 25);
        celsiusField.setEditable(false);
        frame.add(celsiusField);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(150, 130, 100, 30);
        frame.add(convertButton);

        // Convert Button Action
        convertButton.addActionListener(e -> {
            try {
                double f = Double.parseDouble(fahrenheitField.getText());
                double c = (f - 32) * 5 / 9;
                celsiusField.setText(String.format("%.2f", c));
                outputLabel.setText("Conversion completed.");
            } catch (NumberFormatException ex) {
                outputLabel.setText("Invalid input! Please enter a valid number.");
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
