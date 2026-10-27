import javax.swing.*;
import java.awt.*;
class GradeModel {
    private String name;
    private int mark1, mark2, mark3;
    public void setDetails(String name, int m1, int m2, int m3) {
        this.name = name;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    public int getTotal() {
        return mark1 + mark2 + mark3;
    }
    public double getAverage() {
        return getTotal() / 3.0;
    }
    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        if (avg >= 75) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        return "F";
    }
    public String getName() {
        return name;
    }
}
class GradeView extends JFrame {
    JTextField nameField = new JTextField();
    JTextField mark1Field = new JTextField();
    JTextField mark2Field = new JTextField();
    JTextField mark3Field = new JTextField();
    JButton calculateButton = new JButton("Calculate Result");
    GradeView() {
        setTitle("Student Grade Calculator");
        setSize(450, 350);
        setLayout(new GridLayout(5, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Student Name:"));
        add(nameField);
        add(new JLabel("Subject 1 Mark:"));
        add(mark1Field);
        add(new JLabel("Subject 2 Mark:"));
        add(mark2Field);
        add(new JLabel("Subject 3 Mark:"));
        add(mark3Field);
        add(new JLabel(""));
        add(calculateButton);
    }
}
class GradeController {
    private GradeModel model;
    private GradeView view;
    GradeController(GradeModel model, GradeView view) {
        this.model = model;
        this.view = view;
        view.calculateButton.addActionListener(e -> calculate());
    }
    private void calculate() {
        try {
            String name = view.nameField.getText();
            int m1 = Integer.parseInt(view.mark1Field.getText());
            int m2 = Integer.parseInt(view.mark2Field.getText());
            int m3 = Integer.parseInt(view.mark3Field.getText());
            if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                JOptionPane.showMessageDialog(view, "Marks must be between 0 and 100.");
                return;
            }
            model.setDetails(name, m1, m2, m3);
            JOptionPane.showMessageDialog(view,
                    "Student: " + model.getName()
                            + "\nTotal: " + model.getTotal()
                            + "\nAverage: " + String.format("%.2f", model.getAverage())
                            + "\nGrade: " + model.getGrade());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Enter valid marks.");
        }
    }
}
public class ques1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GradeModel model = new GradeModel();
            GradeView view = new GradeView();
            new GradeController(model, view);
            view.setVisible(true);
        });
    }
}