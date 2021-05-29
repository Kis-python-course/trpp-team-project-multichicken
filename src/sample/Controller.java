package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    // я опаздываю на электрон, так что доделаю в нём уже
    // не, ну реально дичь написали, я в шоке девачки =O
    // god bless mvu <3

    /*@FXML
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

    float a;

    @FXML
    void initialize() {
        oneButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "1"));
        TwoButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "2"));
        ThreeButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "3"));
        FourButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "4"));
        FiveButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "5"));
        SixButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "6"));
        SevenButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "7"));
        EightButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "8"));
        nineButton.setOnAction(event -> calcArea.setText(calcArea.getText() + "9"));

        plusButton.setOnAction(event -> calcArea.setText(calcArea.getText() + " + "));
        minusButton.setOnAction(event -> calcArea.setText(calcArea.getText() + " - "));
        divideButton.setOnAction(event -> calcArea.setText(calcArea.getText() + " / "));
        multiplyButton.setOnAction(event -> calcArea.setText(calcArea.getText() + " * "));
    }
     */
    @FXML
    Button one, two, three, four, five, six, seven, eight, nine, zero;

    @FXML
    TextField calcArea;


    void omg(){
        one.setOnAction(event -> calcArea.setText(calcArea.getText() + 1));
    }

    @FXML
    void initialize(){

        one.setOnAction(event -> omg());
    }



}
