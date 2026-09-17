//Week7_Ques2
import doctor.Doctor;
import patient.Patient;

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(1, "Rohan", "Cardiology", 500);
        Doctor d2 = new Doctor(2, "Madhu", "Dermatology", 400);

        Patient p1 = new Patient(101, "Ajay", "Heart", 30);
        Patient p2 = new Patient(102, "Priya", "Skin", 25);
        Patient p3 = new Patient(103, "Kiran", "Heart", 40);

        Doctor[] assigned = {d1, d2, d1};
        Patient[] patients = {p1, p2, p3};

        double total1 = 0, total2 = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Patient Details ---");
            patients[i].display();

            System.out.println("Treating Doctor:");
            assigned[i].display();

            if (assigned[i] == d1)
                total1 += d1.getConsultationFee();
            else
                total2 += d2.getConsultationFee();
        }

        System.out.println("\nTotal collected by " +
                d1.getName() + ": " + total1);

        System.out.println("Total collected by " +
                d2.getName() + ": " + total2);
    }
}
