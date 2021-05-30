package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button one, two, three, four, five, six, seven, eight, nine, zero, doubleZero, plusButton, multiplyButton, minusButton, remOfDivButton, calcButton, absButton, divideButton, clearOne, clearAll;

    @FXML
    TextField calcArea;

    String firstNum = "";
    String secondNum = "";
    boolean another = false;

    void buttonsHandler(){
        one.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 1);
            if (!another) {
                firstNum = firstNum + "1";
            } else {
                secondNum = secondNum + "1";
            }
        });
        two.setOnAction(event -> {
            calcArea.setText(calcArea.getText() + 2);
            if (!another) {
                firstNum = firstNum + "2";
            } else {
                secondNum = secondNum + "2";
            }
        });
        three.setOnAction(event -> {
            calcArea.setText(calcArea.getText() + 3);
            if (!another) {
                firstNum = firstNum + "3";
            } else {
                secondNum = secondNum + "3";
            }
        });
        four.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 4);
            if (!another) {
                firstNum = firstNum + "4";
            } else {
                secondNum = secondNum + "4";
            }
        });
        five.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 5);
            if (!another) {
                firstNum = firstNum + "5";
            } else {
                secondNum = secondNum + "5";
            }
        });
        six.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 6);
            if (!another) {
                firstNum = firstNum + "6";
            } else {
                secondNum = secondNum + "6";
            }
        });
        seven.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 7);
            if (!another) {
                firstNum = firstNum + "7";
            } else {
                secondNum = secondNum + "7";
            }
        });
        eight.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 8);
            if (!another) {
                firstNum = firstNum + "8";
            } else {
                secondNum = secondNum + "8";
            }
        });
        eight.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 8);
            if (!another) {
                firstNum = firstNum + "8";
            } else {
                secondNum = secondNum + "8";
            }
        });
        nine.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 9);
            if (!another) {
                firstNum = firstNum + "9";
            } else {
                secondNum = secondNum + "9";
            }
        });
        zero.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + 0);
            if (!another) {
                firstNum = firstNum + "0";
            } else {
                secondNum = secondNum + "0";
            }
        });
        doubleZero.setOnAction(actionEvent -> {
            calcArea.setText(calcArea.getText() + "00");
            if (!another) {
                firstNum = firstNum + "00";
            } else {
                secondNum = secondNum + "00";
            }
        });
        clearOne.setOnAction(actionEvent -> {
            if (!calcArea.getText().equals("")){
                calcArea.setText(calcArea.getText().substring(0, calcArea.getLength() - 1));
            }
            if (!another) {
                if (!firstNum.equals("")) {
                    firstNum = firstNum.substring(0, calcArea.getLength() - 1);
                }
            } else {
                if (!secondNum.equals("")) {
                    secondNum = secondNum.substring(0, calcArea.getLength() - 1);
                }
            }
        });
        clearAll.setOnAction(actionEvent -> {
            firstNum = "";
            secondNum = "";
            calcArea.setText("");
        });
        plusButton.setOnAction(actionEvent -> {

        });
        minusButton.setOnAction(actionEvent -> {

        });
        multiplyButton.setOnAction(actionEvent -> {

        });
        divideButton.setOnAction(actionEvent -> {

        });
        remOfDivButton.setOnAction(actionEvent -> {

        });
        absButton.setOnAction(actionEvent -> {

        });
        calcButton.setOnAction(actionEvent -> {

        });
    }

    @FXML
    void initialize(){
        //calcButton.setOnAction(event -> calcArea.setText();
      buttonsHandler();
    }



}
