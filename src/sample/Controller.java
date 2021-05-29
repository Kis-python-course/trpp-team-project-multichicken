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

    @FXML
    Button one, two, three, four, five, six, seven, eight, nine, zero, calcButton;

    @FXML
    TextField calcArea;

    double num = 0;

    String firstNum = "";
    String secondNum = "";
    boolean another = false;

    void omg(){

        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calcArea.setText(calcArea.getText() + 1);

                if (!another) {
                    firstNum = firstNum + "1";
                } else {
                    secondNum = secondNum + "1";
                }

            }
        });

        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calcArea.setText(calcArea.getText() + 2);

                if (!another) {
                    firstNum = firstNum + "2";
                } else {
                    secondNum = secondNum + "2";
                }
            }
        });

        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calcArea.setText(calcArea.getText() + 3);

                if (!another) {
                    firstNum = firstNum + "3";
                } else {
                    secondNum = secondNum + "3";
                }
            }
        });

        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calcArea.setText(calcArea.getText() + 4);

                if (!another) {
                    firstNum = firstNum + "4";
                } else {
                    secondNum = secondNum + "4";
                }
            }
        });

        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calcArea.setText(calcArea.getText() + 5);

                if (!another) {
                    firstNum = firstNum + "5";
                } else {
                    secondNum = secondNum + "5";
                }
            }
        });

        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calcArea.setText(calcArea.getText() + 6);

                if (!another) {
                    firstNum = firstNum + "6";
                } else {
                    secondNum = secondNum + "6";
                }
            }
        });
    }

    @FXML
    void initialize(){
        //calcButton.setOnAction(event -> calcArea.setText();
        omg();
    }



}
