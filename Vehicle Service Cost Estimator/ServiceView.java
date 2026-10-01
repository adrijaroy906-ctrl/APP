import javax.swing.*;

public class ServiceView extends JFrame {

    JTextField regNo;
    JComboBox<String> vehicleType;
    JCheckBox general, oil, brake, battery;
    JButton calculate;
    JLabel result;

    ServiceView() {
        setTitle("Vehicle Service Cost");
        setSize(450, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Registration No:");
        l1.setBounds(30, 30, 120, 25);
        add(l1);

        regNo = new JTextField();
        regNo.setBounds(160, 30, 200, 25);
        add(regNo);

        JLabel l2 = new JLabel("Vehicle Type:");
        l2.setBounds(30, 70, 120, 25);
        add(l2);

        vehicleType = new JComboBox<>(
            new String[]{"Two Wheeler", "Car"});
        vehicleType.setBounds(160, 70, 200, 25);
        add(vehicleType);

        general = new JCheckBox("General Service - ₹1000");
        general.setBounds(30, 110, 220, 25);
        add(general);

        oil = new JCheckBox("Oil Change - ₹800");
        oil.setBounds(30, 145, 220, 25);
        add(oil);

        brake = new JCheckBox("Brake Service - ₹1200");
        brake.setBounds(30, 180, 220, 25);
        add(brake);

        battery = new JCheckBox("Battery Check - ₹500");
        battery.setBounds(30, 215, 220, 25);
        add(battery);

        calculate = new JButton("Calculate Cost");
        calculate.setBounds(130, 255, 160, 30);
        add(calculate);

        result = new JLabel();
        result.setBounds(30, 305, 350, 30);
        add(result);

        setVisible(true);
    }
}
