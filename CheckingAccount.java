//include package

public class CheckingAccount extends Account{

    public CheckingAccount(String customerName, String accountNumber){
        super(customerName, accountNumber);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }


}
