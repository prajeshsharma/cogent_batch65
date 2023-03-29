package thread;

public class MyThread extends Thread {
    private final DisplayMessage dm;
    private final String name;

    public MyThread(DisplayMessage dm, String name) {
        this.dm = dm;
        this.name = name;
    }

    @Override
    public void run() {
        dm.sayHello(name);
    }
}
