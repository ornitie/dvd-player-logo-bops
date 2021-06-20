import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Logo label = new Logo();
        Movement m = new Movement(label);
        frame.frame.add(label);
        frame.frame.getContentPane().setBackground(Color.BLACK);
        frame.frame.repaint();
        frame.frame.setLayout(null);
        label.setLocation(0, 0);
        frame.frame.repaint();
        m.run();
//        for (int i = 0; i < 200; i++) {
//            try {
//                label.setLocation(i, i);
//                TimeUnit.MILLISECONDS.sleep(17);
//            } catch (Exception e) {
//
//            }
//        }
    }
}
