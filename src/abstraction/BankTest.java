package abstraction;

public class BankTest {
    public static void main(String[] args) {
        Bank bank;
        bank = new HdcfBank();
        System.out.println(bank.getRateOfInterest());
        bank = new SbiBank();
        System.out.println(bank.getRateOfInterest());
    }
}
