import java.util.*;
class Employee{
    String name;
    int employeeID;
    double basicSal;
    Employee(String name, int employeeID, double basicSal){
        this.name = name;
        this.employeeID = employeeID;
        this.basicSal = basicSal;
    }
    double calculateSalary(){
        return basicSal;
    }
    void display(){
        System.out.println("ID: "+employeeID);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+calculateSalary());
    }
}
class Professor extends Employee{
    double bonus;
    Professor(String name, int employeeID, double basicSal, double bonus){
        super(name, employeeID, basicSal);
        this.bonus = bonus;
    }
    double calculateSalary() {
        return basicSal+(basicSal*bonus/100);
    }
}
class LabAssistant extends Employee{
    double bonus;
    LabAssistant(String name, int employeeID, double basicSal, double bonus){
        super(name, employeeID, basicSal);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return basicSal+(basicSal *bonus/100);
    }
}
class AdministrativeStaff extends Employee{
    double bonus;
    AdministrativeStaff(String name, int employeeID, double basicSal, double bonus){
        super(name, employeeID, basicSal);
        this.bonus = bonus;
    }
    double calculateSalary(){
        return basicSal+(basicSal*bonus/100);
    }
}
public class ques2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the details of Professors: ");
        Professor prof = new Professor(inp.next(), inp.nextInt(), inp.nextDouble(), inp.nextDouble());
        System.out.println("Enter the details of LabAssistants: ");
        LabAssistant lab = new LabAssistant(inp.next(), inp.nextInt(), inp.nextDouble(), inp.nextDouble());
        System.out.println("Enter the details of Admin: ");
        AdministrativeStaff admin = new AdministrativeStaff(inp.next(), inp.nextInt(), inp.nextDouble(), inp.nextDouble());
        System.out.println("Details of Professor: ");
        prof.display();
        System.out.println("Details of LabAssistant: ");
        lab.display();
        System.out.println("Details of Admin: ");
        admin.display();
    }
}