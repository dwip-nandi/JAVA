// Write a java (GUI) program as following specification:  There  will  be  a  MenuBar,  Menus  and  MenuItems. 
//User  will  click  on  MenuItem,  the  output  will display on the output screen. 
import javax.swing.*;

public class problem_8 {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Menu Action Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create MenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create MenuItems
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Add action listeners to MenuItems
        newItem.addActionListener(e -> System.out.println("You clicked New"));
        openItem.addActionListener(e -> System.out.println("You clicked Open"));
        exitItem.addActionListener(e -> {
            System.out.println("Exiting application...");
            System.exit(0);
        });

        cutItem.addActionListener(e -> System.out.println("You clicked Cut"));
        copyItem.addActionListener(e -> System.out.println("You clicked Copy"));
        pasteItem.addActionListener(e -> System.out.println("You clicked Paste"));

        // Add MenuItems to Menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Add MenuBar to frame
        frame.setJMenuBar(menuBar);

        // Make frame visible
        frame.setVisible(true);
    }
}
