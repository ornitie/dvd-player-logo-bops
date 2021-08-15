import javax.swing.*;
import java.awt.*;

public class Main {
    public static void start(Screen s) {
        Logo label = new Logo();
        s.add(label);
        label.setLocation(0, 0);
        label.move();
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        Screen s = new Screen();

        s.repaint();
        frame.setLayout(new BorderLayout());
        frame.frame.add(s);
        frame.frame.add(new Buttons(), BorderLayout.SOUTH);
        s.setLayout(null);
        frame.frame.repaint();
        start(s);
    }
}
