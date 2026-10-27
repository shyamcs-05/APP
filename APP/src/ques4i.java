import java.util.*;
public class ques4i {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Using a temp variable: ");
        System.out.print("Enter the reg no of student1: ");
        String num1 = inp.next();
        System.out.print("\nEnter the reg no of student2: ");
        String num2 = inp.next();
        String temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\nReg no of student1 is: "+num1);
        System.out.println("Reg no of student2 is: "+num2);
    }
}