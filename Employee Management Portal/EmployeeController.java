import javax.swing.*;
import java.awt.event.*;

public class EmployeeController {

    EmployeeModel model;
    EmployeeView view;

    EmployeeController(EmployeeModel model, EmployeeView view) {
        this.model = model;
        this.view = view;

        view.login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkLogin();
            }
        });
    }

    void checkLogin() {
        String user = view.username.getText();
        String pass = new String(view.password.getPassword());

        if (model.login(user, pass)) {
            JOptionPane.showMessageDialog(
                null, "Login Successful");

            showMainWindow();
            view.frame.dispose();

        } else {
            JOptionPane.showMessageDialog(
                null, "Invalid Username or Password");
        }
    }

    void showMainWindow() {
        JFrame frame = new JFrame("Employee Management Portal");

        JMenuBar bar = new JMenuBar();

        JMenu employee = new JMenu("Employee");
        JMenu tools = new JMenu("Tools");
        JMenu exit = new JMenu("Exit");

        JMenuItem add = new JMenuItem("Add Employee");
        JMenuItem viewEmployee = new JMenuItem("View Employee");
        JMenuItem change = new JMenuItem("Change Password");
        JMenuItem logout = new JMenuItem("Logout");
        JMenuItem exitApp = new JMenuItem("Exit Application");

        employee.add(add);
        employee.add(viewEmployee);

        tools.add(change);

        exit.add(logout);
        exit.add(exitApp);

        bar.add(employee);
        bar.add(tools);
        bar.add(exit);

        frame.setJMenuBar(bar);
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        add.addActionListener(e -> addEmployee());
        change.addActionListener(e -> changePassword());

        logout.addActionListener(e -> {
            frame.dispose();
            new EmployeeController(
                model, new EmployeeView());
        });

        exitApp.addActionListener(e -> System.exit(0));

        viewEmployee.addActionListener(e ->
            JOptionPane.showMessageDialog(
                frame,
                "Employee ID: " + model.id +
                "\nName: " + model.name +
                "\nDepartment: " + model.department));
    }

    void addEmployee() {
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(3, 2));

        JTextField id = new JTextField();
        JTextField name = new JTextField();
        JTextField dept = new JTextField();

        panel.add(new JLabel("Employee ID:"));
        panel.add(id);
        panel.add(new JLabel("Employee Name:"));
        panel.add(name);
        panel.add(new JLabel("Department:"));
        panel.add(dept);

        int result = JOptionPane.showConfirmDialog(
            null, panel, "Add Employee",
            JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            model.id = id.getText();
            model.name = name.getText();
            model.department = dept.getText();

            JOptionPane.showMessageDialog(
                null, "Employee Added");
        }
    }

    void changePassword() {
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(3, 2));

        JPasswordField oldPass = new JPasswordField();
        JPasswordField newPass = new JPasswordField();
        JPasswordField confirm = new JPasswordField();

        panel.add(new JLabel("Old Password:"));
        panel.add(oldPass);
        panel.add(new JLabel("New Password:"));
        panel.add(newPass);
        panel.add(new JLabel("Confirm Password:"));
        panel.add(confirm);

        int result = JOptionPane.showConfirmDialog(
            null, panel, "Change Password",
            JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            boolean changed = model.changePassword(
                new String(oldPass.getPassword()),
                new String(newPass.getPassword()),
                new String(confirm.getPassword()));

            if (changed)
                JOptionPane.showMessageDialog(
                    null, "Password Changed");
            else
                JOptionPane.showMessageDialog(
                    null, "Invalid old password or passwords do not match");
        }
    }

    public static void main(String[] args) {
        EmployeeModel model = new EmployeeModel();
        EmployeeView view = new EmployeeView();

        new EmployeeController(model, view);
    }
}
