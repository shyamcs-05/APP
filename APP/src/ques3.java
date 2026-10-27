import java.util.*;
class Employee{
    int n;
    int[] id;
    String[] na;
    int[] s;
    Employee(int[] id, String[] name, int[] salary, int n){
        this.n = n;
        this.id = id;
        na = new String[n];
        s = new int[n];
        for(int i=0;i<n;i++){
            this.id[i] = id[i];
            na[i] = name[i];
            s[i] = salary[i];
        }
    }
    void display(){
        for(int i=0;i<n;i++){
            System.out.println("Details of Employee "+(i+1)+": ");
            System.out.println("ID: "+id[i]);
            System.out.println("Name: "+na[i]);
            System.out.println("Salary: "+s[i]);
        }
    }
}
public class ques3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] id = new int[n];
        String[] name = new String[n];
        int[] salary = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the employee id: ");
            id[i] = inp.nextInt();
            System.out.println("Enter the employee name: ");
            name[i]=inp.next();
            System.out.println("Enter the salary: ");
            salary[i] = inp.nextInt();
        }
        Employee em = new Employee(id, name, salary, n);
        em.display();
    }
}