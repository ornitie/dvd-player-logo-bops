import java.util.concurrent.TimeUnit;

public class Movement implements Runnable {
    private Logo logo;

    public Movement(Logo logo) {
        this.logo = logo;
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
