import javax.swing.JFrame;
import javax.swing.JLabel;

public class problem_2 {
    public static void main(String[] args) {
        // Master Frame
        JFrame frama_a = new JFrame("Master Frame");
        frama_a.setSize(600, 500);
        frama_a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes entire app
        frama_a.add(new JLabel("This is the Master Frame", JLabel.CENTER));
        frama_a.setLocation(100, 100);
        frama_a.setVisible(true);

        // Temporary Frame
        JFrame frame_b = new JFrame("Temporary Frame");
        frame_b.setSize(300, 200);
        frame_b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closes only this frame
        frame_b.add(new JLabel("This is the Temporary Frame", JLabel.CENTER));
        frame_b.setLocation(450, 300);
        frame_b.setVisible(true);
         
        JFrame frame_c = new JFrame("Temporary Frame");
        frame_c.setSize(200, 200);
        frame_c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closes only this frame
        frame_c.add(new JLabel("This is the Temporary Frame", JLabel.CENTER));
        frame_c.setLocation(550, 350);
        frame_c.setVisible(true);
       
    }
} 
