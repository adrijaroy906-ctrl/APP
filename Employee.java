class Employee {
//Week2_ques6
    int empId;
    String name;
    double salary;

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : Rs. " + salary);
        System.out.println();
    }

    public static void main(String args[]) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.empId = 1111;
        e1.name = "Rahul";
        e1.salary = 65000;

        e2.empId = 2222;
        e2.name = "Sam";
        e2.salary = 52000;

        System.out.println("Employee 1 Details");
        e1.display();

        System.out.println("Employee 2 Details");
        e2.display();
    }
}