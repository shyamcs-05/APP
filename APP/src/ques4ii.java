import java.util.*;
public class ques4ii {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Without using the temp variable");
        System.out.print("Enter the reg no of student1: ");
        String num1 = inp.next();
        System.out.print("\nEnter the reg no of student2: ");
        String num2 = inp.next();
        num1 = num1+num2;
        num2 = num1.substring(0,num1.length() - num2.length());
        num1 = num1.substring(num2.length());
        System.out.println("\nReg no of student1 is: "+num1);
        System.out.println("Reg no of student2 is: "+num2);


    }
}