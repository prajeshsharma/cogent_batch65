package thread;

public class SyncronisationDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread(dm, "John");
        MyThread t2 = new MyThread(dm, "Mark");

        t1.start();
        t2.start();
    }
}
