package thread;

import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n, sum;
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("sum of N numbers\nEnter the value:");
        Scanner sc = new Scanner(System.in);
        JoinDemo.n = sc.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();

        try {
            jd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("sum of first " + JoinDemo.n + " numbers is " + JoinDemo.sum + "\nTotal time taken is " + (System.currentTimeMillis() - start) / 1000.0 + " seconds");
    }

    @Override
    public void run() {
        for (int i = 1; i <= JoinDemo.n; i++)
            try {
                JoinDemo.sum += i;
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
