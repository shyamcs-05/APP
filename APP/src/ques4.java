import java.sql.*;
import java.util.Scanner;
public class ques4 {
    static final String URL = "jdbc:mysql://localhost:3306/librarydb";
    static final String USER = "root";
    static final String PASSWORD = "kathir";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            int choice;
            do {
                System.out.println("\n1. Insert Book");
                System.out.println("2. Search Book");
                System.out.println("3. Display Available Books");
                System.out.println("4. Issue Book");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        System.out.print("Author: ");
                        String author = sc.nextLine();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();
                        String insert = "INSERT INTO Book " + "(BookID, Title, Author, Price, Availability) " + "VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insert);
                        ps1.setInt(1, id);
                        ps1.setString(2, title);
                        ps1.setString(3, author);
                        ps1.setDouble(4, price);
                        ps1.setBoolean(5, true);
                        ps1.executeUpdate();
                        System.out.println("Book inserted successfully.");
                        break;
                    case 2:
                        System.out.print("Enter Book ID: ");
                        int searchId = sc.nextInt();
                        String search = "SELECT * FROM Book WHERE BookID = ?";
                        PreparedStatement ps2 = con.prepareStatement(search);
                        ps2.setInt(1, searchId);
                        ResultSet rs1 = ps2.executeQuery();
                        if (rs1.next()) {
                            System.out.println("Book ID: " + rs1.getInt("BookID"));
                            System.out.println("Title: " + rs1.getString("Title"));
                            System.out.println("Author: " + rs1.getString("Author"));
                            System.out.println("Price: " + rs1.getDouble("Price"));
                            System.out.println("Availability: " + rs1.getBoolean("Availability"));
                        } else {
                            System.out.println("Book not found.");
                        }
                        break;
                    case 3:
                        String display = "SELECT * FROM Book WHERE Availability = TRUE";
                        Statement st = con.createStatement();
                        ResultSet rs2 = st.executeQuery(display);
                        while (rs2.next()) {
                            System.out.println(
                                    rs2.getInt("BookID") + " | " +
                                            rs2.getString("Title") + " | " +
                                            rs2.getString("Author") + " | " +
                                            rs2.getDouble("Price"));
                        }
                        break;
                    case 4:
                        System.out.print("Enter Book ID to issue: ");
                        int issueId = sc.nextInt();
                        String update = "UPDATE Book SET Availability = FALSE " + "WHERE BookID = ? AND Availability = TRUE";

                        PreparedStatement ps3 = con.prepareStatement(update);
                        ps3.setInt(1, issueId);
                        int rows = ps3.executeUpdate();
                        if (rows > 0)
                            System.out.println("Book issued successfully.");
                        else
                            System.out.println(
                                    "Book not found or already issued.");
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