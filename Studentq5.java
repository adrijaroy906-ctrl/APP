class Student {
//Week2_ques5
    String name;
    int rollNo;
    String department;

    void display() {
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Department : " + department);
        System.out.println();
    }

    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Raj";
        s1.rollNo = 001;
        s1.department = "Computer Science";

        s2.name = "Siya";
        s2.rollNo = 002;
        s2.department = "Information Technology";

        System.out.println("Student 1 Details");
        s1.display();

        System.out.println("Student 2 Details");
        s2.display();
    }
}