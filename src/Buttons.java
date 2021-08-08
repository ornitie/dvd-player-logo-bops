import javax.swing.*;
import java.awt.*;

public class Buttons extends JPanel {
    public JButton newLogo;

    public Buttons() {
        newLogo = new JButton("New Logo");
        this.setSize(1200, 20);
        this.setLayout(new GridLayout(1, 3));
        this.add(new JLabel());
        this.add(newLogo);
        this.add(new JLabel());
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.repaint();
    }

}
