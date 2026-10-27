package src;

import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int n = inp.nextInt();
        int[] rollno = new int[n];
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the rollno of student" + (i + 1)+": ");
            rollno[i] = inp.nextInt();
            System.out.println("Enter the name of student" + (i + 1) + ": ");
            name[i] = inp.next();
        }
        student1 s = new student1(rollno, name, n);
        s.display();
    }
}
class student1{
    int n;
    int[] r;
    String[] na;
    student1(int[] rollno, String[] name, int n){
        this.n = n;
        r = new int[n];
        na = new String[n];
        for(int i=0; i<n;i++){
            r[i] = rollno[i];
            na[i] = name[i];
        }
    }
    void display(){
        for(int i =0;i<n;i++){
            System.out.println("Details of student"+(i+1)+": ");
            System.out.println("Rollno: "+r[i]);
            System.out.println("Name: "+na[i]);
        }

    }
}