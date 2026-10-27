import java.util.*;
public class ques8 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the basic salary of the employee: ");
        double basic_sal = inp.nextDouble();
        System.out.print("\nEnter the allowance for the employee: ");
        double allowance = inp.nextDouble();
        double total_sal = basic_sal + allowance;
        System.out.println("The total salary of the employee is: "+total_sal);
    }
}