class HospitalThread extends Thread {

    HospitalThread(String name) {
        setName(name);
    }

    public void run() {
        System.out.println(
            "Thread: " + getName() +
            " | Priority: " + getPriority());
    }
}

public class HospitalMonitoring {
    public static void main(String[] args) {

        HospitalThread emergency =
            new HospitalThread("EmergencyAlert");

        HospitalThread vital =
            new HospitalThread("VitalMonitor");

        HospitalThread report =
            new HospitalThread("ReportGenerator");

        emergency.setPriority(Thread.MAX_PRIORITY);
        vital.setPriority(Thread.NORM_PRIORITY);
        report.setPriority(Thread.MIN_PRIORITY);

        emergency.start();
        vital.start();
        report.start();
    }
}
