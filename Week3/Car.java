import java.util.Scanner;
//week3_ques4
class Car {
    String model;
    double price;

    public Car() {
        this.model = "Unknown / Standard Model";
        this.price = 0.0;
    }

    public Car(String model) {
        this.model = model;
        this.price = 0.0; // Default price if not provided
    }

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void displayDetails(String registrationType) {
        System.out.println("\n--- " + registrationType + " ---");
        System.out.println("Car Model : " + this.model);
        System.out.println("Car Price : $" + this.price);
    }

    public static void main(String[] args) {
        
        Car car1 = new Car();
        car1.displayDetails("Registration Method 1 (No Details)");

        
        Car car2 = new Car("Tesla Model 3");
        car2.displayDetails("Registration Method 2 (Model Only)");

        
        Car car3 = new Car("Porsche 911", 120000.50);
        car3.displayDetails("Registration Method 3 (Model & Price)");
    }
}
