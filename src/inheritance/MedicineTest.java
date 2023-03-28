package inheritance;

import java.util.Scanner;

public class MedicineTest {
    public static void main(String[] args) {
        Medicine[] medicines;
        int type = (int) (Math.random() * 3 + 1);
        System.out.println(type);
        switch (type) {
            case 1:  // tablet
                medicines = new Tablet[10];
                System.out.println("Tablet");
                break;
            case 2:  // syrup
                medicines = new Syrup[10];
                System.out.println("Syrup");
                break;
            default:  // ointment
                medicines = new Ointment[10];
                System.out.println("Ointment");
                break;
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < medicines.length; i++) {
            System.out.println("Enter Medicine name");
            String name = sc.nextLine();
            System.out.println("Enter Medicine address");
            String address = sc.nextLine();
            switch (type) {
                case 1: { // tablet
                    System.out.println("Enter Medicine dosage");
                    int dosage = sc.nextInt();
                    sc.nextLine();
                    medicines[i] = new Tablet(name, address, dosage);
                    break;
                }
                case 2: { // syrup
                    System.out.println("Enter Medicine dosage");
                    int dosage = sc.nextInt();
                    sc.nextLine();
                    medicines[i] = new Syrup(name, address, dosage);
                    break;
                }
                default:  // ointment
                    System.out.println("Enter Medicine usage");
                    String usage = sc.nextLine();
                    medicines[i] = new Ointment(name, address, usage);
                    break;
            }
        }

        for (Medicine medicine : medicines) medicine.displayLabel();

    }
}
