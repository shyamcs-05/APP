import student.student;
import course.course;
public class ques5 {
    public static void main(String[] args) {
        student student = new student(
                "shyam",
                101,
                "Computer Science"
        );
        course course = new course(
                "Java Programming",
                "CS201",
                4
        );
        student.displayStudent();
        System.out.println();
        course.displayCourse();
    }
}