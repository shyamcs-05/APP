import java.util.*;
public class ques3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = inp.nextInt();
        System.out.print("\nEnter the breadth: ");
        int breadth = inp.nextInt();
        int area = length*breadth;
        System.out.println("The area of the rectangular playground: "+area);
    }
}