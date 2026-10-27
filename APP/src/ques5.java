import java.sql.*;
import java.util.Scanner;
public class ques5 {
    static final String URL = "jdbc:mysql://localhost:3306/storedb";
    static final String USER = "root";
    static final String PASSWORD = "kathir";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            int choice;
            do {
                System.out.println("\n1. Insert Product");
                System.out.println("2. Retrieve Product");
                System.out.println("3. Update Quantity");
                System.out.println("4. Display Low Stock");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Product ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Product Name: ");
                        String name = sc.nextLine();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();
                        System.out.print("Quantity: ");
                        int quantity = sc.nextInt();
                        String insert = "INSERT INTO Product " + "(ProductID, ProductName, Price, Quantity) " + "VALUES (?, ?, ?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insert);
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setDouble(3, price);
                        ps1.setInt(4, quantity);
                        ps1.executeUpdate();
                        System.out.println("Product inserted successfully.");
                        break;
                    case 2:
                        System.out.print("Enter Product ID: ");
                        int searchId = sc.nextInt();
                        String search = "SELECT * FROM Product WHERE ProductID = ?";
                        PreparedStatement ps2 = con.prepareStatement(search);
                        ps2.setInt(1, searchId);
                        ResultSet rs1 = ps2.executeQuery();
                        if (rs1.next()) {
                            System.out.println("Product ID: " + rs1.getInt("ProductID"));
                            System.out.println("Product Name: " + rs1.getString("ProductName"));
                            System.out.println("Price: " + rs1.getDouble("Price"));
                            System.out.println("Quantity: " + rs1.getInt("Quantity"));
                        } else {
                            System.out.println("Product not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter Product ID: ");
                        int updateId = sc.nextInt();
                        System.out.print("Enter new quantity: ");
                        int newQuantity = sc.nextInt();
                        String update = "UPDATE Product SET Quantity = ? " + "WHERE ProductID = ?";
                        PreparedStatement ps3 = con.prepareStatement(update);
                        ps3.setInt(1, newQuantity);
                        ps3.setInt(2, updateId);
                        int rows = ps3.executeUpdate();
                        if (rows > 0)
                            System.out.println("Quantity updated.");
                        else
                            System.out.println("Product not found.");
                        break;
                    case 4:
                        String lowStock = "SELECT * FROM Product WHERE Quantity < 10";
                        PreparedStatement ps4 = con.prepareStatement(lowStock);
                        ResultSet rs2 = ps4.executeQuery();
                        boolean found = false;
                        while (rs2.next()) {
                            found = true;
                            System.out.println(
                                    rs2.getInt("ProductID") + " | " +
                                            rs2.getString("ProductName") + " | " +
                                            rs2.getDouble("Price") + " | " +
                                            rs2.getInt("Quantity"));
                        }
                        if (!found)
                            System.out.println("No low-stock products.");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 5);
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}