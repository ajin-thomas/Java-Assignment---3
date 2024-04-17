import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class controller implements Initializable {

    @FXML
    private TextField num1TextField;

    @FXML
    private TextField num2TextField;

    @FXML
    private Label resultLabel;

    // Reference to the Model class
    private model model;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize the Model
        model = new model();
    }

    @FXML
    private void calculateSum() {
        // Get the numbers from text fields
        int num1 = Integer.parseInt(num1TextField.getText());
        int num2 = Integer.parseInt(num2TextField.getText());

        // Call the method from the Model to calculate the sum
        int sum = model.calculateSum(num1, num2);

        // Update the result label with the sum
        resultLabel.setText("Sum: " + sum);
    }
}
