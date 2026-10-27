package src;

import java.util.*;
public class ques1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = inp.nextInt();
        int[] rollno = new int[n];
        String[] name = new String[n];
        String[] dept = new String[n];
        for(int i =0;i<n;i++){
            System.out.print("\nEnter the reg no of the student"+(i+1)+":");
            rollno[i] = inp.nextInt();
            System.out.print("\nEnter the name of the student"+(i+1)+":");
            name[i] = inp.next();
            System.out.print("\nEnter the department of the student"+(i+1)+":");
            dept[i] = inp.next();
        }
        Student s = new Student(rollno,name,dept,n);
        s.display();
    }
}
class Student{
    int n;
    int[] r = new int[n];
    String[] na;
    String[] d;
    Student(int[] rollno, String[] name, String[] dept, int n){
        this.n = n;
        r = new int[n];
        na = new String[n];
        d = new String[n];
        for(int i =0;i<n;i++){
            r[i] = rollno[i];
            na[i] = name[i];
            d[i] = dept[i];
        }
    }
    void display(){
        for(int i = 0;i<n;i++){
            System.out.println("\nName: "+na[i]);
            System.out.println("Roll number: "+r[i]);
            System.out.println("Department: "+d[i]);
        }

    }
}