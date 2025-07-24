
import javax.swing.JFrame;

public class problem_1_c extends JFrame {

    problem_1_c() {
        setTitle("My First GUI Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        problem_1_c f = new problem_1_c();
        f.setVisible(true);
    }
}
