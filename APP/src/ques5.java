import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class ques5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Course Management");
        frame.setSize(750, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] courses = {
                "Java Programming", "Python", "Data Structures",
                "Database Management", "Computer Networks"
        };
        JList<String> courseList = new JList<>(courses);
        JScrollPane listScroll = new JScrollPane(courseList);
        String[] columns = {"Student Name", "Selected Course", "Status"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane tableScroll = new JScrollPane(table);
        JTextField studentName = new JTextField(15);
        JButton add = new JButton("Add Registration");
        JButton remove = new JButton("Remove Registration");
        JPanel top = new JPanel();
        top.add(new JLabel("Student Name:"));
        top.add(studentName);
        top.add(add);
        top.add(remove);
        frame.add(top, BorderLayout.NORTH);
        frame.add(listScroll, BorderLayout.WEST);
        frame.add(tableScroll, BorderLayout.CENTER);
        add.addActionListener(e -> {
            String name = studentName.getText();
            String course = courseList.getSelectedValue();
            if (name.isEmpty() || course == null) {
                JOptionPane.showMessageDialog(frame,"Enter student name and select a course.");
            } else {
                model.addRow(new Object[]{name, course, "Enrolled"});
                studentName.setText("");
            }
        });
        remove.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                model.removeRow(row);
            } else {
                JOptionPane.showMessageDialog(frame, "Select a registration to remove.");
            }
        });
        frame.setVisible(true);
    }
}