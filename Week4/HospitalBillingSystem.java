import java.util.Scanner;
//Week4_ques4
class Patient {
 
    String name;
    double consultationFee;

    public Patient(String name, double consultationFee) {
        this.name = name;
        this.consultationFee = consultationFee;
    }

    public double calculateFinalAmount(double fee, double discountPercentage) {
        double discountAmount = fee * (discountPercentage / 100);
        return fee - discountAmount;
    }

   
    public void displayBillDetails() {
        
        double discountRate = (consultationFee >= 2000) ? 10.0 : 5.0;
        
        
        double finalAmount = calculateFinalAmount(consultationFee, discountRate);
        double discountAmount = consultationFee - finalAmount;

        System.out.println("Patient Name: " + name);
        System.out.println("Original Consultation Fee: ₹" + consultationFee);
        System.out.println("Discount Applied (" + discountRate + "%): ₹" + discountAmount);
        System.out.println("Final Amount Payable: ₹" + finalAmount);
        System.out.println("----------------------------------------");
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Patient[] patients = new Patient[5];

      
        System.out.println("--- Enter Consultation Details for 5 Patients ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPatient " + (i + 1) + ":");
            System.out.print("Enter Patient Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Consultation Fee (₹): ");
            double fee = scanner.nextDouble();
            scanner.nextLine(); 

            
            patients[i] = new Patient(name, fee);
        }

        
        System.out.println("\n========================================");
        System.out.println("       PATIENT CONSULTATION BILLS       ");
        System.out.println("========================================");
        for (int i = 0; i < 5; i++) {
            patients[i].displayBillDetails();
        }

        scanner.close();
    }
}
