import javax.swing.*;

public class StudentRegistration {

    public static void main(String[] args) {

        JFrame f = new JFrame("Student Registration");

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 100, 25);

        JTextField name = new JTextField();
        name.setBounds(130, 30, 180, 25);

        JLabel l2 = new JLabel("Register No:");
        l2.setBounds(30, 70, 100, 25);

        JTextField reg = new JTextField();
        reg.setBounds(130, 70, 180, 25);

        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(30, 110, 100, 25);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(130, 110, 70, 25);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(200, 110, 80, 25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JLabel l4 = new JLabel("Department:");
        l4.setBounds(30, 150, 100, 25);

        String departments[] = {
            "CSE", "ECE", "EEE", "Mechanical"
        };

        JComboBox<String> dept =
            new JComboBox<>(departments);

        dept.setBounds(130, 150, 180, 25);

        JButton submit = new JButton("Submit");
        submit.setBounds(130, 200, 100, 30);

        submit.addActionListener(e -> {

            String gender = "";

            if (male.isSelected())
                gender = "Male";
            else if (female.isSelected())
                gender = "Female";

            JOptionPane.showMessageDialog(
                f,
                "Name: " + name.getText() +
                "\nRegister No: " + reg.getText() +
                "\nGender: " + gender +
                "\nDepartment: " + dept.getSelectedItem()
            );
        });

        f.add(l1);
        f.add(name);
        f.add(l2);
        f.add(reg);
        f.add(l3);
        f.add(male);
        f.add(female);
        f.add(l4);
        f.add(dept);
        f.add(submit);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
