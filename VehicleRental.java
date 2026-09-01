import java.util.Scanner;
//Week6_Ques1

class Vehicle {
    String vehicleNumber, brand;
    int speed;

    Vehicle(String vehicleNumber, String brand, int speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String vehicleNumber, String brand, int speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    //Override
    void displayDetails() {
        System.out.println("Car: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String vehicleNumber, String brand, int speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        System.out.println("Bike: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        Vehicle v;   // Parent class reference

        v = new Car("TN01AB1234", "Toyota", 120, 4);
        v.displayDetails();   

        System.out.println();

        v = new Bike("TN02XY5678", "Yamaha", 100, true);
        v.displayDetails();   
    }
}

