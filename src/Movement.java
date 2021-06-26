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
                double x = System.currentTimeMillis();
                double y = System.currentTimeMillis();
                int diff = (int) (y - x);
                TimeUnit.MILLISECONDS.sleep(10000 - (diff));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
