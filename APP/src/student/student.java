package student;
public class student {
    String studentName;
    int studentId;
    String department;
    public student(String studentName, int studentId, String department) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.department = department;
    }
    public void displayStudent() {
        System.out.println("----- Student Details -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + department);
    }
}