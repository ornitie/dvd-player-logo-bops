public class Movement implements Runnable {
    private Logo l;

    public Movement(Logo l) {
        this.l = l;
    }

    @Override
    public void run() {
        while (true) {
            try {
                logo.move();
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
