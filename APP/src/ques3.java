import java.util.*;
interface PaymentMethods{
    void makePayment(double amount);
}
class UPI implements PaymentMethods{
    public void makePayment(double amount){
        System.out.println("Proccessing payment of amount $"+amount+" through UPI securely");
    }
}
class CreditCard implements PaymentMethods{
    public void makePayment(double amount){
        System.out.println("Processing payment of amount $"+amount+" through credit card securely");
    }
}
class NetBanking implements PaymentMethods{
    public void makePayment(double amount){
        System.out.println("Processing payment of amount $"+amount+" through net banking securely");
    }
}
public class ques3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        PaymentMethods payment = null;
        System.out.println("Enter the payable amount: ");
        double amount = inp.nextDouble();
        System.out.println("------checkout-------");
        System.out.println("Enter a payment method:");
        System.out.println("1.UPI");
        System.out.println("2.Credit Card");
        System.out.println("3.Net Banking");
        int choice = inp.nextInt();
        switch(choice){
            case 1:
                payment = new UPI();
                break;
            case 2:
                payment = new CreditCard();
                break;
            case 3:
                payment = new NetBanking();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        payment.makePayment(amount);
    }
}