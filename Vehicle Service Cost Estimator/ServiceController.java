import java.awt.event.*;

public class ServiceController {

    ServiceModel model;
    ServiceView view;

    ServiceController(ServiceModel model, ServiceView view) {
        this.model = model;
        this.view = view;

        view.calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    void calculate() {
        int cost = model.calculateCost(
            view.general.isSelected(),
            view.oil.isSelected(),
            view.brake.isSelected(),
            view.battery.isSelected()
        );

        view.result.setText("Total Service Cost: ₹" + cost);
    }

    public static void main(String[] args) {
        ServiceModel model = new ServiceModel();
        ServiceView view = new ServiceView();

        new ServiceController(model, view);
    }
}
