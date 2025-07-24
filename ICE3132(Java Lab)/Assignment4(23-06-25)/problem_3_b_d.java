
import java.awt.*;

public class problem_3_b_d {
    public static void main(String[] args) {
        Frame frame = new Frame("Grid Layout - Frame");
        frame.setLayout(new GridLayout(3, 1));

        frame.add(new Label("Name:"));
        frame.add(new TextField());
        frame.add(new Button("Submit"));

        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
