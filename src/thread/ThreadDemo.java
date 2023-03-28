package thread;

import static java.lang.Thread.*;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread th1 = new Thread(thread1);
        th1.setName("Thread 1");
        th1.setPriority(MIN_PRIORITY);
        th1.start();

        MyThread thread2 = new MyThread();
        Thread th2 = new Thread(thread2);
        th2.setName("Thread 2");
        th2.setPriority(MAX_PRIORITY);
        th2.start();
    }
}
