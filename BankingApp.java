//Week7_Ques4
class BankTask implements Runnable {
    String activity;
    int delay;

    BankTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName() +
                " : " + activity + " - Count " + i);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(
            new BankTask("Processing transaction", 1000));
        Thread t2 = new Thread(
            new BankTask("Updating balance", 1500));
        Thread t3 = new Thread(
            new BankTask("Sending SMS", 2000));

        t1.setName("Transaction");
        t2.setName("Balance");
        t3.setName("SMS");

        t1.start();
        t2.start();
        t3.start();
    }
}