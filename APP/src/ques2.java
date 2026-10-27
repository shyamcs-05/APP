import java.util.*;
public class ques2 {
    public static void main(String[] args){
        int count =0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the attendance details: ");
        int[] att = new int[7];
        for(int i=0;i<7;i++){
            att[i] = inp.nextInt();
        }
        for(int i=0;i<7;i++){
            if(att[i]==1){
                count+=1;
            }
        }
        System.out.println("Total number of present days: "+count);
        double per = (count/7.0)*100;
        System.out.println("Attendance percentage: "+per);
        if(per >=75.0){
            System.out.println("Eligible for Exam");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
