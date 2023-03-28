package thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++)
            try {
                System.out.println("This is from " + Thread.currentThread().getName() + ": " + i);
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

}
