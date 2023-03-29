package io;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CopyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dest = args[1];
        FileInputStream srcFile;
        FileOutputStream destFile = null;
        File outputFile = new File(dest);
        try {
            srcFile = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Source File does not exist");
            return;
        }
        if (!outputFile.exists() || outputFile.isDirectory()) {
            try {
                new File(dest).createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Destination file does not exist\ncreating destination file and exiting");
            printEllipses();
        } else {
            try {
                destFile = new FileOutputStream(dest);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println("Would you like to overwrite the file? (yes/no)");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                System.out.print("copying file");
                printEllipses();
                try {
                    int data;
                    while ((data = srcFile.read()) != -1)
                        Objects.requireNonNull(destFile).write(data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("File copied successfully");
            }
            else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no"))
                System.out.println("not overwriting file");
        }
    }

    /**
     * prints "..." with 0.53 second delay between each '.'
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
