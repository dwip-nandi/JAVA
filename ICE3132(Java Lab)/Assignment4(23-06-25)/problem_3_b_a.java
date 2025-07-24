// Default Layout (BorderLayout by default) by awt
import java.awt.*;

public class problem_3_b_a {
    public static void main(String[] args) {
        Frame frame = new Frame("Default Layout - Frame");

        frame.add(new Label("Name:"), BorderLayout.NORTH);
        frame.add(new TextField(), BorderLayout.CENTER);
        frame.add(new Button("Submit"), BorderLayout.SOUTH);

        frame.setSize(500, 450);
        frame.setLocation(400, 500);
        frame.setVisible(true);
    }
}
