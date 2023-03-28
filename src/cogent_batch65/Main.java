package cogent_batch65;

import java.util.concurrent.TimeUnit;

public class Main {
    /**
     * prints "..." with 1 second wait between each '.'
     */
    public static void printEllipses() {
        try {
            for (int i = 0; i < 3; i++) {
                TimeUnit.MILLISECONDS.sleep(530);
                System.out.print('.');
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
