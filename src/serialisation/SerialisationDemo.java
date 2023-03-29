package serialisation;

import io.CopyDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerialisationDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Scanner sc = new Scanner(System.in);
        try {
            String answer;
            fos = new FileOutputStream("src/serialisation/student.ser", true);
            oos = new ObjectOutputStream(fos);
            do {
                System.out.println("Enter roll number");
                int rollNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter age");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name");
                String name = sc.nextLine();
                System.out.println("Enter address");
                String address = sc.nextLine();
                Student student = new Student(rollNumber, age, name, address);


                System.out.println("serialising object");
                CopyDemo.printEllipses();
                oos.writeObject(student);
                System.out.println("object serialised");

                System.out.println("enter 'c' to continue, or anything else to quit");
                answer = sc.nextLine();
            } while (answer.equals("c"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
                if (oos != null) oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
