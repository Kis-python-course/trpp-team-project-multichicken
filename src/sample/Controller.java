package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

public class Controller {

    @FXML
    private Button calcButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button remOfDivButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button divideButton;

    @FXML
    private Button absButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button TwoButton;

    @FXML
    private Button ThreeButton;

    @FXML
    private Button EightButton;

    @FXML
    private Button SixButton;

    @FXML
    private Button FourButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button FiveButton;

    @FXML
    private Button SevenButton;

    @FXML
    private TextField calcArea;

    @FXML
    void initialize(){
        oneButton.setOnMousePressed(event ->{
        });
        plusButton.setOnAction(event -> {
            //plus button press
            int x = 0;
        });
    }
}
