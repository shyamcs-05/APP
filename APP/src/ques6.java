import java.util.*;
public class ques6 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the seat number: ");
        int seat_no = inp.nextInt();
        if(seat_no%2 ==0){
            System.out.println("\nThe given seat number is even");
        }
        else{
            System.out.println("The given seat number is odd");
        }
    }
}