import javax.swing.*;
import java.awt.*;
class ServiceModel {
    public int calculateCost(boolean general, boolean oil, boolean brake, boolean battery) {
        int total = 0;
        if (general) total += 1000;
        if (oil) total += 800;
        if (brake) total += 1200;
        if (battery) total += 500;
        return total;
    }
}
class ServiceView extends JFrame {
    JTextField regField = new JTextField();
    JRadioButton twoWheeler = new JRadioButton("Two Wheeler");
    JRadioButton car = new JRadioButton("Car");
    JCheckBox general = new JCheckBox("General Service - Rs.1000");
    JCheckBox oil = new JCheckBox("Oil Change - Rs.800");
    JCheckBox brake = new JCheckBox("Brake Service - Rs.1200");
    JCheckBox battery = new JCheckBox("Battery Check - Rs.500");
    JButton calculate = new JButton("Calculate Cost");
    JLabel result = new JLabel("Total: Rs.0");
    ServiceView() {
        setTitle("Vehicle Service Cost Estimator");
        setSize(500, 400);
        setLayout(new GridLayout(8, 1, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Vehicle Registration Number:"));
        add(regField);
        JPanel typePanel = new JPanel();
        ButtonGroup group = new ButtonGroup();
        group.add(twoWheeler);
        group.add(car);
        typePanel.add(twoWheeler);
        typePanel.add(car);
        add(typePanel);
        add(general);
        add(oil);
        add(brake);
        add(battery);
        JPanel bottom = new JPanel();
        bottom.add(calculate);
        bottom.add(result);
        add(bottom);
    }
}
class ServiceController {
    private ServiceModel model;
    private ServiceView view;
    ServiceController(ServiceModel model, ServiceView view) {
        this.model = model;
        this.view = view;
        view.calculate.addActionListener(e -> calculate());
    }
    private void calculate() {
        String reg = view.regField.getText();
        if (reg.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Enter vehicle registration number.");
            return;
        }
        if (!view.twoWheeler.isSelected() && !view.car.isSelected()) {
            JOptionPane.showMessageDialog(view, "Select vehicle type.");
            return;
        }
        int total = model.calculateCost(
                view.general.isSelected(),
                view.oil.isSelected(),
                view.brake.isSelected(),
                view.battery.isSelected()
        );
        view.result.setText("Total: Rs." + total);
    }
}
public class ques2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ServiceModel model = new ServiceModel();
            ServiceView view = new ServiceView();
            new ServiceController(model, view);
            view.setVisible(true);
        });
    }
}