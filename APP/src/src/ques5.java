package src;

import java.util.*;
public class ques5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        student s1 = new student(inp.nextInt(), inp.next(), inp.nextInt());
        student s2 = new student(inp.nextInt(), inp.next(), inp.nextInt());
        System.out.println("Student 1 details:");
        s1.display();
        System.out.println("Student 2 details:");
        s2.display();
    }
}
class student{
    int r;
    String n;
    int a;
    student(int rollno, String name, int age){
        r=rollno;
        n= name;
        a=age;
    }
    void display(){
        System.out.println("Rollno: "+r+"\nName: "+n+"\nage: "+a);
    }
}