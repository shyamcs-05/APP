import java.util.*;
public class ques2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the price of product 1: ");
        int num1 = inp.nextInt();
        System.out.print("Enter the price of product 2: ");
        int num2 = inp.nextInt();
        System.out.println("The total is: "+(num1+num2));
        System.out.println("The difference is: "+(num1-num2));
        System.out.println("The product is: "+(num1*num2));
        System.out.println("The quotient is: "+(num1/num2));
        System.out.println("The remainder is: "+(num1%num2));
    }
}