package doctor;

public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private double consultationFee;

    public Doctor(int id, String name, String spec, double fee) {
        doctorId = id;
        this.name = name;
        specialization = spec;
        consultationFee = fee;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void display() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Fee: " + consultationFee);
    }
}
