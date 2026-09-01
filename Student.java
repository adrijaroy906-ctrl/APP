import java.util.Scanner;
//Week6_Ques5

package Student;

public class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

