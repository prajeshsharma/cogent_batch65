package serialisation;

import io.CopyDemo;

import java.io.*;

public class DeSerialisationDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        System.out.println("de-serialising object(s)");
        CopyDemo.printEllipses();
        try {
            fis = new FileInputStream("src/serialisation/student.ser");
            ois = new ObjectInputStream(fis);
            while (true) {
                Object obj = ois.readObject();
                Student student = (Student) obj;
                System.out.println(student.toString());
            }
        } catch (EOFException e) {
            System.out.println("object(s) de-serialisied");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (ois != null) ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
