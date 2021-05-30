package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button one, two, three, four, five, six, seven, eight, nine, zero, doubleZero, plusButton, multiplyButton, minusButton, remOfDivButton, calcButton, absButton, divideButton, clearOne, clearAll;

    @FXML
    TextField calcArea;

    String firstNum = "", secondNum = "", param = "";
    int result = 0;



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
            another = true;
            param = "plus";
            calcArea.setText(calcArea.getText() + "+");
        });

        minusButton.setOnAction(actionEvent -> {
            another = true;
            param = "minus";
            calcArea.setText(calcArea.getText() + "-");
        });

        multiplyButton.setOnAction(actionEvent -> {
            another = true;
            param = "multiply";
            calcArea.setText(calcArea.getText() + "*");
        });

        divideButton.setOnAction(actionEvent -> {
            another = true;
            param = "divide";
            calcArea.setText(calcArea.getText() + "/");
        });

        remOfDivButton.setOnAction(actionEvent -> {
            another = true;
            param = "plus";
            calcArea.setText(calcArea.getText() + "%");
        });

        absButton.setOnAction(actionEvent -> {
            another = true;
            param = "plus";
            calcArea.setText(calcArea.getText() + "^");
        });

        calcButton.setOnAction(actionEvent -> {
            switch (param) {
                case "plus":
                    result = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
                    break;
                case "minus":
                    result = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
                    break;
                case "multiply":
                    result = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
                    break;
                case "divide":
                    result = Integer.parseInt(firstNum) % Integer.parseInt(secondNum);
                    break;
                case "div":
                    result = Integer.parseInt(firstNum) % Integer.parseInt(secondNum);
                    break;
                case "abs":
                    result = Math.abs(Integer.parseInt(firstNum));
                    break;
            }

            calcArea.setText(String.valueOf(result));

            param = "";
            firstNum = "";
            secondNum = "";
            result = 0;
            another = false;
        });
    }

    @FXML
    void initialize(){
        //calcButton.setOnAction(event -> calcArea.setText();
      buttonsHandler();
    }



}
