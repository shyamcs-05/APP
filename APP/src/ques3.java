import javax.swing.*;
import java.awt.*;
public class ques3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration");
        frame.setSize(450, 350);
        frame.setLayout(new GridLayout(6, 2, 5, 5));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField nameField = new JTextField();
        JTextField regField = new JTextField();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        String[] departments = {"CSE", "ECE", "EEE", "IT", "Mechanical"};
        JComboBox<String> departmentBox = new JComboBox<>(departments);
        JButton submit = new JButton("Submit");
        frame.add(new JLabel("Student Name:"));
        frame.add(nameField);
        frame.add(new JLabel("Register Number:"));
        frame.add(regField);
        frame.add(new JLabel("Gender:"));
        frame.add(genderPanel);
        frame.add(new JLabel("Department:"));
        frame.add(departmentBox);
        frame.add(new JLabel(""));
        frame.add(submit);
        submit.addActionListener(e -> {
            String gender = male.isSelected() ? "Male": female.isSelected() ? "Female" : "Not selected";
            String message = "Name: " + nameField.getText() + "\nRegister No: " + regField.getText() + "\nGender: " + gender + "\nDepartment: " + departmentBox.getSelectedItem();
            JOptionPane.showMessageDialog(frame, message);
        });
        frame.setVisible(true);
    }
}