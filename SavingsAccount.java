public class SavingsAccount extends Account {
    public SavingsAccount(String customerName, String accountNumber) {
        super(customerName, accountNumber);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}