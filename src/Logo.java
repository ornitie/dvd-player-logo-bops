import javax.swing.*;
import java.awt.*;

public class Logo extends JLabel {
    private double angle;
    private int verticalDirection;
    private int horizontalDirection;
    private final int HEIGHT = 130;
    private final int WIDTH = 256;

    public Logo() {
        verticalDirection = -1;
        horizontalDirection = -1;
        randomizeAngle();
        ImageIcon icon = new ImageIcon("resources/logo-red.png");
        Image image = icon.getImage().getScaledInstance(WIDTH, HEIGHT, java.awt.Image.SCALE_SMOOTH);
        icon.setImage(image);
        this.setSize(WIDTH, HEIGHT);
        this.setIcon(icon);
    }

    private void randomizeAngle() {
        this.angle = Math.random() * 4 + 1;
        this.verticalDirection *= -1;
        this.horizontalDirection *= -1;
    }

    private void bopBottom() {
        this.angle = Math.random() * 4 + 1;
        this.verticalDirection *= -1;
    }

    private void bopSides() {
        this.angle = Math.random() * 4 + 1;
        this.horizontalDirection *= -1;
    }

    public void move() {
        Timer timer = new Timer(16, e -> {
            Point location = this.getLocation();
            location.setLocation(location.x + horizontalDirection, location.y + angle * verticalDirection);
            super.setLocation(location);
            if ((location.x + this.getWidth()) >= 1200 || location.x < 0) {
                bopSides();
            }
            if (location.y < 0 || (location.y + this.getHeight()) * 1.05 >= 720) {
                bopBottom();
            }
        });
        timer.setRepeats(true);
        timer.start();
    }
}
