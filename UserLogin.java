import javax.swing.*;

public class UserLogin {

    public static void main(String[] args) {

        JFrame f = new JFrame("User Login");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(30, 30, 100, 25);

        JTextField username = new JTextField();
        username.setBounds(130, 30, 180, 25);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(30, 70, 100, 25);

        JPasswordField password = new JPasswordField();
        password.setBounds(130, 70, 180, 25);

        JCheckBox remember =
            new JCheckBox("Remember Me");
        remember.setBounds(30, 110, 130, 25);

        JCheckBox notify =
            new JCheckBox("Receive Notifications");
        notify.setBounds(30, 140, 180, 25);

        JButton login = new JButton("Login");
        login.setBounds(120, 190, 100, 30);

        login.addActionListener(e -> {

            String user = username.getText();
            String pass =
                new String(password.getPassword());

            if (user.equals("admin") &&
                pass.equals("admin123")) {

                JOptionPane.showMessageDialog(
                    f, "Login Successful");

            } else {
                JOptionPane.showMessageDialog(
                    f, "Invalid Username or Password");
            }
        });

        f.add(l1);
        f.add(username);
        f.add(l2);
        f.add(password);
        f.add(remember);
        f.add(notify);
        f.add(login);

        f.setSize(350, 280);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
