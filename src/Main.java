import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Logo label = new Logo();
        frame.frame.add(label);
        frame.frame.getContentPane().setBackground(Color.BLACK);
        frame.frame.repaint();
    }
}
