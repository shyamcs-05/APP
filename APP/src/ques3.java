import javax.swing.*;
import java.awt.*;
class EmployeeModel {
    private String password = "admin123";
    public boolean login(String username, String enteredPassword) {
        return username.equals("admin") && enteredPassword.equals(password);
    }
    public boolean changePassword(String oldPassword, String newPassword, String confirmPassword) {
        if (!password.equals(oldPassword)) return false;
        if (!newPassword.equals(confirmPassword)) return false;
        if (newPassword.isEmpty()) return false;
        password = newPassword;
        return true;
    }
}
class LoginView extends JFrame {
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton login = new JButton("Login");
    LoginView() {
        setTitle("Employee Portal Login");
        setSize(350, 200);
        setLayout(new GridLayout(3, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Username:"));
        add(username);
        add(new JLabel("Password:"));
        add(password);
        add(new JLabel(""));
        add(login);
    }
}
class MainView extends JFrame {
    JMenuItem addEmployee = new JMenuItem("Add Employee");
    JMenuItem viewEmployee = new JMenuItem("View Employee");
    JMenuItem changePassword = new JMenuItem("Change Password");
    JMenuItem logout = new JMenuItem("Logout");
    JMenuItem exit = new JMenuItem("Exit Application");
    MainView() {
        setTitle("Employee Management Portal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar bar = new JMenuBar();
        JMenu employee = new JMenu("Employee");
        employee.add(addEmployee);
        employee.add(viewEmployee);
        JMenu tools = new JMenu("Tools");
        tools.add(changePassword);
        JMenu exitMenu = new JMenu("Exit");
        exitMenu.add(logout);
        exitMenu.add(exit);
        bar.add(employee);
        bar.add(tools);
        bar.add(exitMenu);
        setJMenuBar(bar);
    }
}
class EmployeeController {
    private EmployeeModel model;
    private LoginView loginView;
    private MainView mainView;
    EmployeeController(EmployeeModel model, LoginView loginView) {
        this.model = model;
        this.loginView = loginView;
        loginView.login.addActionListener(e -> login());
    }
    private void login() {
        String user = loginView.username.getText();
        String pass = new String(loginView.password.getPassword());
        if (model.login(user, pass)) {
            loginView.dispose();
            showMainView();
        } else {
            JOptionPane.showMessageDialog(loginView, "Invalid username or password.");
        }
    }
    private void showMainView() {
        mainView = new MainView();
        mainView.addEmployee.addActionListener(e -> addEmployee());
        mainView.viewEmployee.addActionListener(e ->
                JOptionPane.showMessageDialog(mainView, "Employee details can be displayed here."));
        mainView.changePassword.addActionListener(e -> changePassword());
        mainView.logout.addActionListener(e -> logout());
        mainView.exit.addActionListener(e -> System.exit(0));
        mainView.setVisible(true);
    }
    private void addEmployee() {
        JTextField id = new JTextField();
        JTextField name = new JTextField();
        JTextField dept = new JTextField();
        Object[] fields = {
                "Employee ID:", id,
                "Employee Name:", name,
                "Department:", dept
        };
        int result = JOptionPane.showConfirmDialog(mainView, fields, "Add Employee", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(mainView, "Employee Added Successfully!");
        }
    }
    private void changePassword() {
        JPasswordField oldPass = new JPasswordField();
        JPasswordField newPass = new JPasswordField();
        JPasswordField confirmPass = new JPasswordField();
        Object[] fields = {
                "Old Password:", oldPass,
                "New Password:", newPass,
                "Confirm Password:", confirmPass
        };
        int result = JOptionPane.showConfirmDialog(
                mainView, fields, "Change Password",
                JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            boolean changed = model.changePassword(
                    new String(oldPass.getPassword()),
                    new String(newPass.getPassword()),
                    new String(confirmPass.getPassword())
            );
            JOptionPane.showMessageDialog(mainView, changed ? "Password changed successfully." : "Invalid old password or passwords do not match.");
        }
    }
    private void logout() {
        mainView.dispose();
        loginView = new LoginView();
        loginView.username.setText("");
        loginView.password.setText("");
        loginView.login.addActionListener(e -> login());
        loginView.setVisible(true);
    }
}
public class ques3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeModel model = new EmployeeModel();
            LoginView view = new LoginView();
            new EmployeeController(model, view);
            view.setVisible(true);
        });
    }
}