
// Write a java (GUI) program to create MenuBar, Menus and MenuItem into a frame. 
import javax.swing.*;
import java.awt.event.*;

public class problem_4 {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("MenuBar Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create MenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create MenuItems for File Menu
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listener to Exit
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Closes application
            }
        });

        // Add items to File Menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // adds a line separator
        fileMenu.add(exitItem);

        // Create MenuItems for Edit Menu
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Add items to Edit Menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set MenuBar to the frame
        frame.setJMenuBar(menuBar);

        // Show Frame
        frame.setVisible(true);
    }
}
