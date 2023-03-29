package thread;

public class DisplayMessage {
    public synchronized void sayHello(String name) {
        for (int i = 0; i <= 10; i++)
            try {
                System.out.println("Hello " + name);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
