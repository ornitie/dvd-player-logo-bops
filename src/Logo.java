import javax.swing.*;
import java.awt.*;

public class Logo extends JLabel {
    public Logo(){
        ImageIcon icon = new ImageIcon("resources/logo-red.png");
        Image image = icon.getImage().getScaledInstance(128, 65, java.awt.Image.SCALE_SMOOTH);
        icon.setImage(image);
        this.setSize(128,65);
        this.setIcon(icon);
    }
}
