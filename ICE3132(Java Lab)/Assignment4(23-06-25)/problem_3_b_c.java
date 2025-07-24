// bordered layout
import java.awt.*;

public class problem_3_b_c {
    public static void main(String[] args) {
        Frame frame = new Frame("Border Layout - Frame");
        frame.setLayout(new BorderLayout());

        frame.add(new Label("Name:"), BorderLayout.NORTH);
        frame.add(new TextField(), BorderLayout.CENTER);
        frame.add(new Button("Submit"), BorderLayout.SOUTH);

        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
