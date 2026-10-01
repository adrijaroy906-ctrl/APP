import java.sql.*;
import java.util.Scanner;

public class LibraryJDBC {

    static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/library",
            "root",
            "password" //Replace "password" with your actual MySQL password
        );
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Connection con = getConnection();

        System.out.println("1. Insert Book");
        System.out.println("2. Search Book");
        System.out.println("3. Display Available Books");
        System.out.println("4. Change Availability");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Book ID: ");
            int id = sc.nextInt();

            System.out.print("Title: ");
            String title = sc.next();

            System.out.print("Author: ");
            String author = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            String sql = "INSERT INTO Book VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, author);
            ps.setDouble(4, price);
            ps.setBoolean(5, true);

            ps.executeUpdate();

            System.out.println("Book inserted");
        }

        else if (choice == 2) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();

            String sql = "SELECT * FROM Book WHERE BookID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Title: " +
                    rs.getString("Title"));
                System.out.println("Author: " +
                    rs.getString("Author"));
                System.out.println("Price: " +
                    rs.getDouble("Price"));
                System.out.println("Available: " +
                    rs.getBoolean("Availability"));
            } else {
                System.out.println("Book not found");
            }
        }

        else if (choice == 3) {
            String sql = "SELECT * FROM Book WHERE Availability=true";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("BookID") + " " +
                    rs.getString("Title") + " " +
                    rs.getString("Author") + " " +
                    rs.getDouble("Price"));
            }
        }

        else if (choice == 4) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();

            String sql =
                "UPDATE Book SET Availability=false WHERE BookID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Book issued successfully");
        }

        con.close();
        sc.close();
    }
}

