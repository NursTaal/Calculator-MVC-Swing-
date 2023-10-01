import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener {

    CalculatorModel model;

    public Controller(Viewer viewer){
        this.model = new CalculatorModel(viewer);
    }

    public void actionPerformed(ActionEvent event) {
      String command = event.getActionCommand();
      model.doAction(command);
    }
}
