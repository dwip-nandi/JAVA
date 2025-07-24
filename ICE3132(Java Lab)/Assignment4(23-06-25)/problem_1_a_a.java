// update code for problem_1_a

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class problem_1_a_a {
    public static void main(String[] args) {
        Frame f = new Frame("My First GUI Frame");
        f.setSize(600, 300); 
        f.setVisible(true); 

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });
    }
}
