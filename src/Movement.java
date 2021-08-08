public class Movement implements Runnable {
    private Logo l;

    public Movement(Logo l) {
        this.l = l;
    }

    @Override
    public void run() {
        l.move();
    }
}
