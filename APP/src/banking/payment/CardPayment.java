package banking.payment;
import banking.markers.OnlineTransaction;
public class CardPayment implements Payment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("Rs." + amount +
                " paid successfully using Card.");
    }
}