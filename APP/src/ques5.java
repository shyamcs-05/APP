import java.util.*;
public class ques5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Score of student1: ");
        int score1 = inp.nextInt();
        System.out.print("\nEnter the Score of student2: ");
        int score2 = inp.nextInt();
        System.out.print("\nEnter the Score of student3: ");
        int score3 = inp.nextInt();
        if(score1>score2 && score1>score3){
            System.out.println("\nThe highest score is: "+score1);
        }
        else if(score2>score1 && score2>score3){
            System.out.println("The highest score is: "+score2);
        }
        else{
            System.out.println("The highest score is: "+score3);
        }
    }
}