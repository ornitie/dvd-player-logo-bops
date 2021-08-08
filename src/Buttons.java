import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JPanel implements ActionListener {
    public JButton newLogo;
    private Screen parent;

    public Buttons(Screen s) {
        parent = s;
        newLogo = new JButton("New Logo");
        newLogo.addActionListener(this);
        this.setSize(1200, 20);
        this.setLayout(new GridLayout(1, 3));
        this.add(new JLabel());
        this.add(newLogo);
        this.add(new JLabel());
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Logo l = new Logo();
        parent.add(l);
        l.setLocation(0, 0);
        Movement m = new Movement(l);
        m.run();
    }
}
