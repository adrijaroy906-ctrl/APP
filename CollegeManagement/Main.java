import Student.Student;
import Course.Course;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Aashi", 101);
        Course c = new Course("Java", 501);

        s.displayStudent();
        c.displayCourse();
    }
}
