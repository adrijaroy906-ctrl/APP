class FoodTask extends Thread {

    String activity;

    FoodTask(String name, String activity) {
        setName(name);
        this.activity = activity;
    }

    public void run() {
        System.out.println(
            "Thread: " + getName() +
            " | Priority: " + getPriority() +
            " | Activity: " + activity);
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        FoodTask order =
            new FoodTask("OrderProcessing",
                         "Processing customer order");

        FoodTask delivery =
            new FoodTask("DeliveryTracking",
                         "Tracking delivery location");

        FoodTask notification =
            new FoodTask("Notification",
                         "Sending order notification");

        order.setPriority(10);
        delivery.setPriority(5);
        notification.setPriority(1);

        order.start();
        delivery.start();
        notification.start();
    }
}
