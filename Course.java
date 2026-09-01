import java.util.Scanner;
//Week6_Ques5


package Course;

public class Course {
    String courseName;
    int courseCode;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

