
// Write a java (GUI) program to create Radio Buttons, Combo box and Check Boxes. Also create two 
// panels which include those Radio Buttons, Combo box and Check boxes.
import javax.swing.*;
import java.awt.*;

public class problem_5 {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("GUI with Panels, RadioButtons, ComboBox, CheckBoxes");
        frame.setSize(800, 500);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2)); // Two panels side by side

        // -------- Panel 1: Radio Buttons and Combo Box --------
        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder("Panel 1: Gender & Country"));
        panel1.setLayout(new GridLayout(4, 1));

        // Radio buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup(); // Grouping radio buttons
        genderGroup.add(male);
        genderGroup.add(female);

        // Combo box
        String[] countries = { "Bangladesh", "India", "USA", "Canada" };
        JComboBox<String> countryBox = new JComboBox<>(countries);

        // Add to panel1
        panel1.add(new JLabel("Select Gender:"));
        panel1.add(male);
        panel1.add(female);
        panel1.add(new JLabel("Select Country:"));
        panel1.add(countryBox);

        // -------- Panel 2: Checkboxes --------
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder("Panel 2: Skills"));
        panel2.setLayout(new GridLayout(4, 1));

        JCheckBox java = new JCheckBox("Java");
        JCheckBox cpp = new JCheckBox("C++");
        JCheckBox php = new JCheckBox("PHP");
        JCheckBox python = new JCheckBox("Python");

        panel2.add(new JLabel("Select Your Skills:"));
        panel2.add(java);
        panel2.add(cpp);
        panel2.add(php);
        panel2.add(python);

        // Add both panels to the frame
        frame.add(panel1);
        frame.add(panel2);

        // Make frame visible
        frame.setVisible(true);
    }
}
