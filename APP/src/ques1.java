import Studentmanagement.student;
import Coursemanagement.course;
public class ques1 {
    public static void main(String[] args){
        student s = new student("Student 1", 101, "Cyber");
        course c = new course("Java", "CS101",4);
        s.displays();
        c.displayc();
    }
}