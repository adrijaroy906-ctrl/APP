class Student {
//week2_ques3
    String name;
    int rollNo;
    String department;

    void display() {
        System.out.println("Student Details");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Department : " + department);
    }

    public static void main(String args[]) {

        Student s = new Student();

        s.name = "Rashi";
        s.rollNo = 122;
        s.department = "Computer Science";

        s.display();
    }
}