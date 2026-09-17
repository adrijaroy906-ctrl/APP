//Week7_Ques5
class TrafficJunction extends Thread {
    String status;
    int delay;

    TrafficJunction(String status, int delay) {
        this.status = status;
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                getName() + " : " + status);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TrafficSystem {
    public static void main(String[] args) {
        TrafficJunction t1 =
            new TrafficJunction("Heavy Traffic", 1000);

        TrafficJunction t2 =
            new TrafficJunction("Moderate Traffic", 1500);

        TrafficJunction t3 =
            new TrafficJunction("Light Traffic", 2000);

        t1.setName("Junction 1");
        t2.setName("Junction 2");
        t3.setName("Junction 3");

        t1.start();
        t2.start();
        t3.start();
    }
}