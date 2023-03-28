package exceptionHandling;

import static exceptionHandling.Designation.*;

public class Emp {
    private final int empId;
    private final String empName;
    private final Designation designation;
    private final double basic;
    private final double hra;

    public Emp(int empId, String empName, Designation designation, double basic) throws LowSalException {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        if (basic < 500) throw new LowSalException();
        this.basic = (double) Math.round(100 * basic) / 100;
        this.hra = Math.round(100 * (designation == MANAGER ? 0.1 * basic : designation == OFFICER ? 0.12 * basic : 0.05 * basic)) / 100.0;
    }

    @Override
    public String toString() {
        return "ID: " + empId + "\nname: " + empName + "\ndesignation: " + designation + "\nbasic: $" +
                String.format("%.2f", basic) + "\nhra: $" + String.format("%.2f", hra);
    }

    public static class LowSalException extends Throwable { }
}
