import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiFunctionGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multi-Function GUI");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // === Menu Bar ===
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem aboutItem = new JMenuItem("About");

        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        // === Label to show menu output ===
        JLabel outputLabel = new JLabel("Output will appear here.");
        outputLabel.setBounds(20, 10, 450, 25);
        frame.add(outputLabel);

        aboutItem.addActionListener(e -> outputLabel.setText("This is a multi-function GUI example."));
        exitItem.addActionListener(e -> System.exit(0));

        // === Red and Green Buttons ===
        JButton redButton = new JButton("Red");
        redButton.setBounds(30, 50, 100, 30);
        frame.add(redButton);

        JButton greenButton = new JButton("Green");
        greenButton.setBounds(150, 50, 100, 30);
        frame.add(greenButton);

        redButton.addActionListener(e -> frame.getContentPane().setBackground(Color.RED));
        greenButton.addActionListener(e -> frame.getContentPane().setBackground(Color.GREEN));

        // === Temperature Converter ===
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitLabel.setBounds(30, 100, 100, 25);
        frame.add(fahrenheitLabel);

        JTextField fahrenheitField = new JTextField();
        fahrenheitField.setBounds(150, 100, 100, 25);
        frame.add(fahrenheitField);

        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusLabel.setBounds(30, 140, 100, 25);
        frame.add(celsiusLabel);

        JTextField celsiusField = new JTextField();
        celsiusField.setBounds(150, 140, 100, 25);
        celsiusField.setEditable(false);
        frame.add(celsiusField);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(150, 180, 100, 30);
        frame.add(convertButton);

        convertButton.addActionListener(e -> {
            try {
                double f = Double.parseDouble(fahrenheitField.getText());
                double c = (f - 32) * 5 / 9;
                celsiusField.setText(String.format("%.2f", c));
                outputLabel.setText("Conversion successful.");
            } catch (NumberFormatException ex) {
                outputLabel.setText("Please enter a valid number.");
            }
        });

        frame.setVisible(true);
    }
}
