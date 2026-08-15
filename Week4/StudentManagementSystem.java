import java.util.Scanner;
//Week4_Ques2
class Student {
    int rollNo;
    String name;
    double[] marks = new double[3];
    double attendance;

    public Student(int rollNo, String name, double[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    public double getAverage() {
        double total = 0;
        for (double m : marks) {
            total += m;
        }
        return total / 3.0;
    }

    public void displayPerformance() {
        double avg = getAverage();
        
        String status = (avg >= 50) ? "Pass" : "Fail";
        String scholarship = (avg >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        String classification = (avg >= 85) ? "Excellent" : "Good";

        System.out.println("Roll No: " + rollNo + " | Name: " + name);
        System.out.println("Average Marks: " + avg + "% | Attendance: " + attendance + "%");
        System.out.println("Status: " + status + " | Scholarship: " + scholarship + " | Performance: " + classification);
        System.out.println("-----------------------------------------------------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        System.out.println("--- Enter Details for 5 Students ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Name: ");
            String name = scanner.nextLine();

            double[] tempMarks = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                tempMarks[j] = scanner.nextDouble();
            }

            System.out.print("Attendance Percentage: ");
            double attendance = scanner.nextDouble();

            students[i] = new Student(rollNo, name, tempMarks, attendance);
        }

        
        System.out.println("                    STUDENT PERFORMANCE REPORT                  ");
        System.out.println("=================================================================");
        
        Student topStudent = students[0];

        for (int i = 0; i < 5; i++) {
            students[i].displayPerformance();
            topStudent = (students[i].getAverage() > topStudent.getAverage()) ? students[i] : topStudent;
        }

        System.out.println("\n=================================================================");
        System.out.println("                     TOP PERFORMER OF THE CLASS                 ");
        System.out.println("=================================================================");
        System.out.println("Name: " + topStudent.name);
        System.out.println("Roll Number: " + topStudent.rollNo);
        System.out.println("Highest Average: " + topStudent.getAverage() + "%");
      

        scanner.close();
    }
}
