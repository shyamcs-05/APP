import java.util.*;
class Student {
    int rollNumber;
    String name;
    double[] marks = new double[3];
    double attendance;

    Student(int rollNumber, String name, double m1, double m2, double m3, double attendance) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
        this.attendance = attendance;
    }
    void displayPerformance() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / 3.0;

        String result = (average >= 50) ? "Pass" : "Fail";
        String scholarship = (average >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        String classification = (average >= 85) ? "Excellent" : "Good";

        System.out.printf("Roll No: %d | Name: %-10s | Avg: %5.2f | Status: %-4s | Scholarship: %-12s | Performance: %s%n",
                rollNumber, name, average, result, scholarship, classification);
    }

    public double getAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / 3.0;
    }
}

public class ques2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter the details of student1: ");
        students.add(new Student(inp.nextInt(),inp.next(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble()));
        System.out.println("Enter the details of student2: ");
        students.add(new Student(inp.nextInt(),inp.next(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble()));
        System.out.println("Enter the details of student3: ");
        students.add(new Student(inp.nextInt(),inp.next(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble()));
        System.out.println("Enter the details of student4: ");
        students.add(new Student(inp.nextInt(),inp.next(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble()));
        System.out.println("Enter the details of student5: ");
        students.add(new Student(inp.nextInt(),inp.next(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble()));
        System.out.println("--- Student Performance Summary ---");
        Student topStudent = students.isEmpty() ? null : students.get(0);
        for (Student s : students) {
            s.displayPerformance();

            if (topStudent != null && s.getAverage() > topStudent.getAverage()) {
                topStudent = s;
            }
        }
        if (topStudent != null) {
            System.out.println("\n--- Top Performing Student ---");
            System.out.printf("Highest Average: %5.2f by %s (Roll No: %d)%n",
                    topStudent.getAverage(), topStudent.name, topStudent.rollNumber);
        }
    }
}