import java.awt.*;

public class Main {
    public static void start(Screen s) {
        Logo l = new Logo();
        s.add(l);
        l.setLocation(0, 0);
        Movement m = new Movement(l);
        m.run();
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        Screen s = new Screen();

        s.repaint();
        frame.setLayout(new BorderLayout());
        frame.frame.add(s);
        frame.frame.add(new Buttons(s), BorderLayout.SOUTH);
        s.setLayout(null);
        frame.frame.repaint();
        start(s);
    }
}
