import banking.accounts.Account;
import banking.accounts.SavingsAccount;
import banking.accounts.CurrentAccount;

import banking.payment.Payment;
import banking.payment.SecurePayment;
import banking.payment.UPIPayment;
import banking.payment.CardPayment;
import banking.markers.OnlineTransaction;
public class ques6 {
    public static void main(String[] args) {
        System.out.println("ACCOUNT DETAILS");
        Account account;
        account = new SavingsAccount(
                "SA101",
                "shyam",
                50000,
                4.5
        );
        account.displayDetails();
        System.out.println();
        account = new CurrentAccount(
                "CA201",
                "menon",
                75000,
                25000
        );
        account.displayDetails();
        System.out.println("\nPAYMENT DETAILS");
        Payment payment;
        payment = new UPIPayment();
        payment.pay(1500);
        payment = new CardPayment();
        payment.pay(2500);
        System.out.println("\nSECURE PAYMENT");
        SecurePayment securePayment = new UPIPayment();
        securePayment.verifyPayment();
        securePayment.pay(3000);
        System.out.println("\nONLINE TRANSACTION CHECK");
        Payment upi = new UPIPayment();
        Payment card = new CardPayment();
        checkOnlineTransaction(upi);
        checkOnlineTransaction(card);
    }
    public static void checkOnlineTransaction(Payment payment) {
        if (payment instanceof OnlineTransaction) {
            System.out.println(
                    payment.getClass().getSimpleName()
                            + " is an Online Transaction."
            );
        } else {
            System.out.println(
                    payment.getClass().getSimpleName()
                            + " is not an Online Transaction."
            );
        }
    }
}