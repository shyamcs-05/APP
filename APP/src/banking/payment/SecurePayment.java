package banking.payment;
public interface SecurePayment extends Payment {
    void verifyPayment();
}