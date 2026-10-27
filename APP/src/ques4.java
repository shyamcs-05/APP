import javax.swing.*;
import java.awt.*;
public class ques4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Login");
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(4, 2, 5, 5));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        JCheckBox rememberMe = new JCheckBox("Remember Me");
        JCheckBox notifications = new JCheckBox("Receive Notifications");
        JButton login = new JButton("Login");
        frame.add(new JLabel("Username:"));
        frame.add(username);
        frame.add(new JLabel("Password:"));
        frame.add(password);
        frame.add(rememberMe);
        frame.add(notifications);
        frame.add(new JLabel(""));
        frame.add(login);
        login.addActionListener(e -> {
            String user = username.getText();
            String pass = new String(password.getPassword());
            if (user.equals("admin") && pass.equals("admin123")) {
                JOptionPane.showMessageDialog(frame,"Login successful!\nRemember Me: " + rememberMe.isSelected() + "\nNotifications: " + notifications.isSelected());
            } else {
                JOptionPane.showMessageDialog(frame,"Invalid username or password");
            }
        });
        frame.setVisible(true);
    }
}