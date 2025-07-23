import java.awt.*;

public class AWTFrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame("My First GUI Frame");
        f.setSize(400, 300);         // optional: set width and height
        f.setVisible(true);          // explicitly make frame visible
    }
}
