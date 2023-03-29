package thread;

public class PrinterCounterStorage extends Thread {
    public static void main(String[] args) {
        Storage s = new Storage();
        Counter c = new Counter(s);
        Printer p = new Printer(s);

        c.start();
        p.start();
    }
}

class Storage {
    int count;
    boolean b = false;

    synchronized public void getCount() {
        while (!b) try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("gotten count: " + count);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b = false;
        notify();
    }

    synchronized public void setCount(int count) {
        while (b) try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.count = count;
        b = true;
        System.out.println("set count: " + count);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}

class Counter extends Thread {
    Storage s;

    public Counter(Storage s) {
        this.s = s;
        new Thread(this, "counter").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) s.setCount(i++);
    }
}

class Printer extends Thread {
    Storage s;
    public Printer(Storage s) {
        this.s = s;
        new Thread(this, "printer").start();
    }

    @Override
    public void run() {
        while (true) s.getCount();
    }
}
