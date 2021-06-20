import javax.swing.*;
import java.awt.*;

public class Logo extends JLabel {
    private double angle;

    public Logo() {
        angle = Math.random()*4+1;
        ImageIcon icon = new ImageIcon("resources/logo-red.png");
        Image image = icon.getImage().getScaledInstance(128, 65, java.awt.Image.SCALE_SMOOTH);
        icon.setImage(image);
        this.setSize(128, 65);
        this.setIcon(icon);
    }

    public double randomizeAngle() {
        angle = Math.random();
        return angle;
    }

    public void move() {
        Point location = this.getLocation();
        location.setLocation(location.x +  1, location.y +  angle);
        this.setLocation(location);
    }
}
