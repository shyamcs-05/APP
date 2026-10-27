import java.util.*;
public class ques1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String std_name = inp.next();
        System.out.print("\nEnter the registeration number: ");
        int reg_num = inp.nextInt();
        System.out.print("\nEnter the Department: ");
        String dept = inp.next();
        System.out.print("\nEnter the year of study: ");
        int yr_study = inp.nextInt();
        System.out.print("\nEnter the College name: ");
        String clg_name = inp.next();
        System.out.println("\nStudent Details");
        System.out.println("Student name: "+std_name );
        System.out.println("Regestration number: "+reg_num);
        System.out.println("Department name: "+dept);
        System.out.println("Year of study: "+yr_study);
        System.out.println("College name: "+clg_name);
    }
}