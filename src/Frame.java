import javax.swing.*;

public class Frame extends JFrame {
    public JFrame frame;

    public Frame() {
        frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 720);
        frame.setVisible(true);
    }
}
