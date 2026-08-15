import java.util.Scanner;
//Week4_ques1
class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayBill() {
        double totalPrice = price * quantity;
        double discountPercent = (totalPrice >= 5000) ? 10.0 : 5.0;
        double discountAmount = totalPrice * (discountPercent / 100);
        double finalPrice = totalPrice - discountAmount;

        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Price: Rs" + totalPrice);
        System.out.println("Discount (" + discountPercent + "%): Rs" + discountAmount);
        System.out.println("Final Price: Rs" + finalPrice);
        System.out.println("-----------------------------------");
    }
}

public class ProductBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        System.out.println("--- Enter Details for 5 Products ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nProduct " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(id, name, price, quantity);
        }

        System.out.println("\n===================================");
        System.out.println("          FINAL BILL            ");
        System.out.println("===================================");
        for (int i = 0; i < 5; i++) {
            products[i].displayBill();
        }
        
        scanner.close();
    }
}
