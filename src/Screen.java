import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {

    public Screen() {
        this.setSize(1200, 720);
        this.setVisible(true);
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));
        this.setBackground(Color.BLACK);
    }
}
