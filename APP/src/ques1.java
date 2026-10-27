import java.util.*;
class Bankaccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    Bankaccount(String accountNumber, String accountHolderName, double intialbalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if(intialbalance >=0){
            this.balance = intialbalance;
        }
        else{
            this.balance =0;
            System.out.println("Intial balance cannot be negative. Set to 0.0");
        }
    }
    void deposit(double amount){
        if(amount>0){
            this.balance +=amount;
            System.out.println("Successfully deposited: $"+amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount <=this.balance){
            this.balance -= amount;
            System.out.println("Successfully withdrew: $"+amount);
        }
        else if(amount>this.balance){
            System.out.println("Insufficient funds for withdrawal");
        }
        else{
            System.out.println("Invalid withdrawal amount");
        }
    }
    void display(){
        System.out.println("\n----Account Details----");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Current Balance: "+balance);
    }
}
public class ques1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Account number: ");
        String accountNumber = inp.next();
        System.out.print("\nEnter the account Holder name: ");
        String accountHolderName = inp.next();
        System.out.print("\nEnter the intial balance: ");
        double intialBalance = inp.nextDouble();
        Bankaccount bank = new Bankaccount(accountNumber, accountHolderName, intialBalance);
        bank.display();
        bank.deposit(500.0);
        bank.display();
        bank.withdraw(300);
        bank.display();
        bank.withdraw(8000);
    }
}