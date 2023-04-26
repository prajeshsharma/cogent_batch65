package exceptionHandling;

public class CalcAndBankAccountTest {
    public static void main(String[] args) {
        try {
            CalcAverage c = new CalcAverage();
            double a = c.avgFirstN(-1);
            System.out.println(a);
            Number n = new Number(2, 0);
            n.div();
            System.out.println(n.getResult());
        } catch (IllegalArgumentException e) {
            System.out.println("Number must be positive");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        BankAccount sheldonBank = null;
        BankAccount rajBank = null;
        try {
            sheldonBank = new BankAccount(73, "Sheldon Cooper", "savings", 1000);
            sheldonBank.deposit(8732);
            rajBank = new BankAccount(43, "Rajesh Koothrapalli", "current", 5100);
            rajBank.deposit(273654);
            rajBank.withdraw(1);
        } catch (BankAccount.NegativeAmountException e) {
            System.out.println("No negative balance");
        } catch (BankAccount.InsufficientFundsException e) {
            System.out.println("No insufficient funds");
        }
        assert sheldonBank != null;
        System.out.println(sheldonBank.getBalance() + '\n' + (rajBank != null ? rajBank.getBalance() : 0));

    }
}
