package research;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button one, two, three, four, five, six, seven, eight, nine, zero, doubleZero, plusButton, multiplyButton, minusButton, remOfDivButton, calcButton, absButton, divideButton, clearOne, clearAll;

    @FXML
    TextField calcArea;

    @FXML
    TextArea logsField;

    String firstNum = "";
    String secondNum = "";
    String param = "";
    double result = 0;
    boolean blockNumsInput = false;
    boolean mathOperationDefined = false;
    boolean another = false;
    void numsInput(String num) {
        if (!blockNumsInput) {
            calcArea.setText(calcArea.getText() + num);
            if (!another) {
                firstNum = firstNum + num;
            } else {
                secondNum = secondNum + num;
            }
        }
    }
    void mathOperationAction(String operation) {
        String text = calcArea.getText();
        String operationSymbol = "";
        switch (operation) {
            case "Plus" -> operationSymbol = "+";
            case "Minus" -> operationSymbol = "-";
            case "Multiply" -> operationSymbol = "*";
            case "Divide" -> operationSymbol = "/";
            case "RemOfDiv" -> operationSymbol = "%";
            case "Abs" -> operationSymbol = "|";
        }
        if (mathOperationDefined) {
            if (!operation.equals(param)) {
                if (operation.equals("Abs")) {
                    switch (param) {
                        case "Plus" -> calcArea.setText(text.replace(" + ", ""));
                        case "Minus" -> calcArea.setText(text.replace(" - ", ""));
                        case "Multiply" -> calcArea.setText(text.replace(" * ", ""));
                        case "Divide" -> calcArea.setText(text.replace(" / ", ""));
                        case "RemOfDiv" -> calcArea.setText(text.replace(" % ", ""));
                    }
                    calcArea.setText("|" + text + "|");
                } else {
                    switch (param) {
                        case "Plus" -> calcArea.setText(text.replace("+", operationSymbol));
                        case "Minus" -> calcArea.setText(text.replace("-", operationSymbol));
                        case "Multiply" -> calcArea.setText(text.replace("*", operationSymbol));
                        case "Divide" -> calcArea.setText(text.replace("/", operationSymbol));
                        case "RemOfDiv" -> calcArea.setText(text.replace("%", operationSymbol));
                        case "Abs" -> {
                            calcArea.setText(text.replaceAll("\\|", ""));
                            calcArea.setText(text + " " + operationSymbol + " ");
                        }
                    }
                }
                param = operation;
            }
        } else
            try {
                if (!firstNum.equals("")) {
                    Double.parseDouble(firstNum);
                    logsField.setText(logsField.getText() + "\nSuccessful first num parse!");
                    another = true;
                    param = operation;
                    if (!operation.equals("Abs")) {
                        calcArea.setText(text + " " + operationSymbol + " ");
                    } else calcArea.setText(operationSymbol + text + operationSymbol);
                    mathOperationDefined = true;
                } else {
                    logsField.setText("\n" + logsField.getText() + "\nPrint your first num first!");
                }
            } catch (Exception e) {
                e.printStackTrace();
                logsField.setText("\n" + logsField.getText() + "\nCan't parse first num! Calc reset.");
                resetCalculator();
            }
    }
    void resetCalculator() {
        firstNum = "";
        secondNum = "";
        calcArea.setText("");
        param = "";
        firstNum = "";
        secondNum = "";
        result = 0;
        another = false;
        blockNumsInput = false;
    }
    void buttonsHandler() {
        calcArea.setEditable(false);
        logsField.wrapTextProperty().set(true);
        one.setOnAction(actionEvent -> numsInput("1"));
        two.setOnAction(event -> numsInput("2"));
        three.setOnAction(event -> numsInput("3"));
        four.setOnAction(actionEvent -> numsInput("4"));
        five.setOnAction(actionEvent -> numsInput("5"));
        six.setOnAction(actionEvent -> numsInput("6"));
        seven.setOnAction(actionEvent -> numsInput("7"));
        eight.setOnAction(actionEvent -> numsInput("8"));
        nine.setOnAction(actionEvent -> numsInput("9"));
        zero.setOnAction(actionEvent -> numsInput("0"));
        doubleZero.setOnAction(actionEvent -> numsInput("00"));
        clearOne.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                if (!calcArea.getText().equals("")) {
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
            }
        });
        clearAll.setOnAction(actionEvent -> resetCalculator());
        plusButton.setOnAction(actionEvent -> mathOperationAction("Plus"));
        minusButton.setOnAction(actionEvent -> mathOperationAction("Minus"));
        multiplyButton.setOnAction(actionEvent -> mathOperationAction("Multiply"));
        divideButton.setOnAction(actionEvent -> mathOperationAction("Divide"));
        remOfDivButton.setOnAction(actionEvent -> mathOperationAction("RemOfDiv"));
        absButton.setOnAction(actionEvent -> mathOperationAction("Abs"));
        calcButton.setOnAction(actionEvent -> {
            if (!firstNum.equals("")) {
                if (param.equals("Abs")) {
                    result = Math.abs(Double.parseDouble(firstNum));
                } else {
                    try {
                        Double.parseDouble(secondNum);
                        switch (param) {
                            case "Plus" -> result = Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
                            case "Minus" -> result = Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
                            case "Multiply" -> result = Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
                            case "Divide" -> result = Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
                            case "RemOfDiv" -> result = Double.parseDouble(firstNum) % Double.parseDouble(secondNum);
                        }
                        calcArea.setText("" + result);
                        param = "";
                        firstNum = "" + result;
                        secondNum = "";
                        result = 0;
                        another = false;
                        mathOperationDefined = false;
                        logsField.setText(logsField.getText() + "\nSuccessful second num parse!");

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        logsField.setText(logsField.getText() + "\nCan't parse second num!");
                    }
                }
            } else {
                logsField.setText(logsField.getText() + "\nThere is nothing to calc!");
            }
        });
    }
    @FXML
    void initialize() {
        buttonsHandler();
    }


}
