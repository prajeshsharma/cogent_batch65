package exceptionHandling;

public class BankAccount {
    private final String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float balance) throws NegativeAmountException, InsufficientFundsException {
        this.accType = accType;
        if (balance < 0) throw new NegativeAmountException("Cannot deposit negative amount");
        if (accType.equals("savings") && balance < 1000)
            throw new InsufficientFundsException("Savings account have minimum of Rs. 1000");
        if (accType.equals("current") && balance < 5000)
            throw new InsufficientFundsException("Current account have minimum of Rs. 5000");
        this.balance = balance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) throw new NegativeAmountException("Cannot deposit negative amount");
        balance += amt;
    }

    public void withdraw(float amt) throws InsufficientFundsException, NegativeAmountException {
        if (amt < 0) throw new NegativeAmountException("Cannot withdraw negative amount");
        if (accType.equals("savings") && amt < 1000)
            throw new InsufficientFundsException("Savings account must withdraw minimum of Rs. 1000");
        if (accType.equals("current") && amt < 5000)
            throw new InsufficientFundsException("Current account must withdraw minimum of Rs. 5000");

    }

    public float getBalance() {
        return balance;
    }


    public static class InsufficientFundsException extends Throwable {
        public InsufficientFundsException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static class NegativeAmountException extends Throwable {
        public NegativeAmountException(String errorMessage) {
            super(errorMessage);
        }
    }
}
