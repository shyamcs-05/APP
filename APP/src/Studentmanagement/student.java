package Studentmanagement;

public class student {
    String name;
    int rollno;
    String dept;
    public student(String name, int rollno, String dept){
        this.name = name;
        this.rollno = rollno;
        this.dept = dept;
    }
    public void displays(){
        System.out.println("Student details");
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+rollno);
        System.out.println("Department: "+dept);
    }
}