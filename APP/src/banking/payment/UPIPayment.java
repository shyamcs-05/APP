package banking.payment;
import banking.markers.OnlineTransaction;
public class UPIPayment implements SecurePayment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("Rs." + amount +
                " paid successfully using UPI.");
    }
    public void verifyPayment() {
        System.out.println("UPI payment verified successfully.");
    }
}