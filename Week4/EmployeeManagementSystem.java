import java.util.Scanner;
//Week4_Ques3
class Employee {
    int empId;
    String name;
    double monthlySalary;

    public Employee(int empId, String name, double monthlySalary) {
        this.empId = empId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }


    public double calculateBonus() {
        return (monthlySalary >= 30000) ? (calculateAnnualSalary() * 0.10) : 0.0;
    }

    public String checkEligibility() {
        return (monthlySalary >= 30000) ? "Eligible (10% Bonus)" : "Not Eligible";
    }


    public void displayEmployeeDetails() {
        double annualSalary = calculateAnnualSalary();
        double bonus = calculateBonus();
        String eligibility = checkEligibility();

        System.out.println("ID: " + empId + " | Name: " + name);
        System.out.println("Monthly Salary: ₹" + (int)monthlySalary + " | Annual Salary: ₹" + (int)annualSalary);
        System.out.println("Bonus Amount  : ₹" + (int)bonus + " | Status: " + eligibility);
        System.out.println("-------------------------------------------------------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];


        System.out.println("--- Enter Details for 5 Employees ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Monthly Salary (₹): ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }



        System.out.println("\n=========================================================================");
        System.out.println("                       EMPLOYEE ANNUAL SALARY REPORT                     ");
        System.out.println("=========================================================================");
        for (int i = 0; i < 5; i++) {
            employees[i].displayEmployeeDetails();
        }

        scanner.close();
    }
}
