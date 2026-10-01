import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CourseManagement {

    public static void main(String[] args) {

        JFrame f = new JFrame("Course Management");

        String courses[] = {
            "Java",
            "Python",
            "Data Structures",
            "Database",
            "Computer Networks"
        };

        JList<String> list = new JList<>(courses);

        JScrollPane listScroll =
            new JScrollPane(list);

        listScroll.setBounds(30, 30, 150, 120);

        JButton add = new JButton("Add");
        add.setBounds(50, 170, 90, 30);

        JButton remove = new JButton("Remove");
        remove.setBounds(50, 210, 90, 30);

        String columns[] = {
            "Student Name",
            "Course",
            "Status"
        };

        DefaultTableModel model =
            new DefaultTableModel(columns, 0);

        JTable table = new JTable(model);

        JScrollPane tableScroll =
            new JScrollPane(table);

        tableScroll.setBounds(200, 30, 300, 150);

        JTextField student =
            new JTextField("Student");

        student.setBounds(200, 200, 150, 25);

        add.addActionListener(e -> {

            String course = list.getSelectedValue();

            if (course != null) {
                model.addRow(new Object[]{
                    student.getText(),
                    course,
                    "Enrolled"
                });
            }
        });

        remove.addActionListener(e -> {

            int row = table.getSelectedRow();

            if (row != -1)
                model.removeRow(row);
        });

        f.add(listScroll);
        f.add(add);
        f.add(remove);
        f.add(tableScroll);
        f.add(student);

        f.setSize(550, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
