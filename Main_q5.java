import java.util.Scanner;
//Week6_Ques5
import Student.Student;
import Course.Course;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Adrija", 101);
        Course c = new Course("Computer Science", 501);

        s.displayStudent();
        c.displayCourse();
    }
}

