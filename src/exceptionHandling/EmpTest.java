package exceptionHandling;

import static exceptionHandling.Designation.*;

public class EmpTest {
    public static void main(String[] args) throws Emp.LowSalException {
        try {
            Emp sheldon = new Emp(1, "Sheldon Cooper", OFFICER, 4637.38);
            System.out.println(sheldon);
            System.out.println();
            Emp raj = new Emp(2, "Rajesh Koothrapalli", CLERK, 750);
            System.out.println(raj);
            System.out.println();
            Emp howard = new Emp(3, "Howard Joel Wolowitz", MANAGER, 1000);
            System.out.println(howard);
        } catch (Emp.LowSalException e) {
            System.out.println("Salary must be at least 500");
        }
    }
}
