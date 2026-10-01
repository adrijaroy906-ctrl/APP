import java.awt.event.*;

public class StudentController {
    StudentModel model;
    StudentView view;

    StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;

        view.calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    void calculate() {
        model.name = view.nameField.getText();
        model.m1 = Integer.parseInt(view.mark1.getText());
        model.m2 = Integer.parseInt(view.mark2.getText());
        model.m3 = Integer.parseInt(view.mark3.getText());

        view.result.setText(
            "Total: " + model.getTotal() +
            " | Average: " + model.getAverage() +
            " | Grade: " + model.getGrade()
        );
    }

    public static void main(String[] args) {
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();

        new StudentController(model, view);
    }
}
