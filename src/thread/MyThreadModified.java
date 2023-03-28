package thread;

import static java.lang.Thread.sleep;

public class MyThreadModified implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++)
            try {
                System.out.println("This is from " + Thread.currentThread().getName() + ": " + i);
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

}
