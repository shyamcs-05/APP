package banking.accounts;
public class CurrentAccount extends Account {
    private double overdraftLimit;
    public CurrentAccount(String accountNumber, String accountHolder,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void displayDetails() {
        System.out.println("----- Current Account -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Overdraft Limit: Rs." + overdraftLimit);
    }
}