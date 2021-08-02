public class Main {
    public static void start(Screen s) {
        Logo label = new Logo();
        Movement m = new Movement(label);
        s.add(label);
        label.setLocation(0, 0);
        label.move();
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        Screen s = new Screen();

        s.repaint();
        frame.frame.add(s);
        s.setLayout(null);
        frame.frame.repaint();
        start(s);
    }
}
