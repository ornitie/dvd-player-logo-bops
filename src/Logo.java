import javax.swing.*;
import java.awt.*;

public class Logo extends JLabel {
    private double angle;
    private int direction;
    private final int HEIGHT = 130;
    private final int WIDTH = 256;

    public Logo() {
        direction = -1;
        randomizeAngle();
        ImageIcon icon = new ImageIcon("resources/logo-red.png");
        Image image = icon.getImage().getScaledInstance(WIDTH, HEIGHT, java.awt.Image.SCALE_SMOOTH);
        icon.setImage(image);
        this.setSize(WIDTH, HEIGHT);
        this.setIcon(icon);
    }

    private void randomizeAngle() {
        this.angle = Math.random() * 4 + 1;
        this.direction *= -1;
    }

    public void move() {
        Timer timer = new Timer(16, e -> {
            Point location = this.getLocation();
            location.setLocation(location.x + direction, location.y + angle * direction);
            super.setLocation(location);
            if ((location.x + this.getWidth()) >= 1200 || (location.y + this.getHeight())*1.05 >= 720 || location.x < 0 || location.y < 0) {
                randomizeAngle();
            }
        });
        timer.setRepeats(true);
        timer.start();
    }
}
