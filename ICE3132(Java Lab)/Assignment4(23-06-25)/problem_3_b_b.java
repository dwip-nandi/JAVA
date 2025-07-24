//FlowLayout
import java.awt.*;

public class problem_3_b_b {
    public static void main(String[] args) {
        Frame frame = new Frame("Flow Layout - Frame");
        frame.setLayout(new FlowLayout());

        frame.add(new Label("Name:"));
        frame.add(new TextField(15));
        frame.add(new Button("Submit"));

        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
