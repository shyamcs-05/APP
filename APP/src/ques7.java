import java.util.*;
public class ques7 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Student mark: ");
        int std_marks = inp.nextInt();
        if(std_marks>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}