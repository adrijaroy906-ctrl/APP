import javax.swing.*;

public class StudentView extends JFrame {
    JTextField nameField, mark1, mark2, mark3;
    JButton calculateButton;
    JLabel result;

    StudentView() {
        setTitle("Student Grade Calculator");
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Student Name:");
        l1.setBounds(30, 30, 120, 25);
        add(l1);

        nameField = new JTextField();
        nameField.setBounds(150, 30, 180, 25);
        add(nameField);

        JLabel l2 = new JLabel("Subject 1:");
        l2.setBounds(30, 70, 120, 25);
        add(l2);

        mark1 = new JTextField();
        mark1.setBounds(150, 70, 180, 25);
        add(mark1);

        JLabel l3 = new JLabel("Subject 2:");
        l3.setBounds(30, 110, 120, 25);
        add(l3);

        mark2 = new JTextField();
        mark2.setBounds(150, 110, 180, 25);
        add(mark2);

        JLabel l4 = new JLabel("Subject 3:");
        l4.setBounds(30, 150, 120, 25);
        add(l4);

        mark3 = new JTextField();
        mark3.setBounds(150, 150, 180, 25);
        add(mark3);

        calculateButton = new JButton("Calculate Result");
        calculateButton.setBounds(110, 195, 170, 30);
        add(calculateButton);

        result = new JLabel();
        result.setBounds(30, 240, 330, 70);
        add(result);

        setVisible(true);
    }
}
