import java.sql.*;
import java.util.Scanner;

public class ProductJDBC {

    static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/store",
            "root",
            "password"   //Replace "password" with your actual MySQL password.
        );
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Connection con = getConnection();

        System.out.println("1. Insert Product");
        System.out.println("2. Retrieve Product");
        System.out.println("3. Update Quantity");
        System.out.println("4. Low Stock Products");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Product ID: ");
            int id = sc.nextInt();

            System.out.print("Product Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            String sql =
                "INSERT INTO Product VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);
            ps.setInt(4, quantity);

            ps.executeUpdate();

            System.out.println("Product inserted");
        }

        else if (choice == 2) {
            System.out.print("Product ID: ");
            int id = sc.nextInt();

            String sql =
                "SELECT * FROM Product WHERE ProductID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(
                    rs.getInt("ProductID") + " " +
                    rs.getString("ProductName") + " " +
                    rs.getDouble("Price") + " " +
                    rs.getInt("Quantity"));
            } else {
                System.out.println("Product not found");
            }
        }

        else if (choice == 3) {
            System.out.print("Product ID: ");
            int id = sc.nextInt();

            System.out.print("New Quantity: ");
            int quantity = sc.nextInt();

            String sql =
                "UPDATE Product SET Quantity=? WHERE ProductID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, quantity);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Quantity updated");
        }

        else if (choice == 4) {
            String sql =
                "SELECT * FROM Product WHERE Quantity < 10";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("ProductID") + " " +
                    rs.getString("ProductName") + " " +
                    rs.getInt("Quantity"));
            }
        }

        con.close();
        sc.close();
    }
}
