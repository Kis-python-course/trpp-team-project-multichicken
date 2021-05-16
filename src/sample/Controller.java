package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
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
    void initialize() {
        oneButton.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {

            }
        });
    }
}
