import javax.swing.*;

public class EmployeeView {

    JFrame frame;
    JTextField username, id, name, department;
    JPasswordField password;
    JButton login;

    EmployeeView() {
        frame = new JFrame("Employee Login");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(30, 30, 100, 25);
        frame.add(l1);

        username = new JTextField();
        username.setBounds(130, 30, 160, 25);
        frame.add(username);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(30, 70, 100, 25);
        frame.add(l2);

        password = new JPasswordField();
        password.setBounds(130, 70, 160, 25);
        frame.add(password);

        login = new JButton("Login");
        login.setBounds(120, 120, 100, 30);
        frame.add(login);

        frame.setVisible(true);
    }
}
