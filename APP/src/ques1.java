import java.util.*;
public class ques1 {
    public static void main(String[] args){
        int total =0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the price of the products: ");
        int[] price = new int[5];
        for(int i =0;i<5;i++){
            price[i] = inp.nextInt();
            total+=price[i];
        }
        System.out.println("Total Bill: "+total);
        if(total>5000){
            System.out.println("Discount applicable");
        }
        else{
            System.out.println("No Discount");
        }
    }
}