package src;

import java.util.*;
class Employee{
    int id;
    String n;
    String d;
    Employee(int id, String name, String dept){
        this.id = id;
        n= name;
        d =dept;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+n);
        System.out.println("Department: "+d);
    }
}
public class ques6 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Employee e = new Employee(inp.nextInt(), inp.next(), inp.next());
        Employee e2 = new Employee(inp.nextInt(), inp.next(), inp.next());
        System.out.println("Details of employee1: ");
        e.display();
        System.out.println("Details of employee2: ");
        e2.display();
    }
}