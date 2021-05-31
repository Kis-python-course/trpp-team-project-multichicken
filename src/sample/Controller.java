package sample;


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
    boolean mathOperDefined = false;


    boolean another = false;

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
        if (mathOperDefined) {
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
                        mathOperDefined = true;
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
        one.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 1);
                if (!another) {
                    firstNum = firstNum + "1";
                } else {
                    secondNum = secondNum + "1";
                }
            }
        });
        two.setOnAction(event -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 2);
                if (!another) {
                    firstNum = firstNum + "2";
                } else {
                    secondNum = secondNum + "2";
                }
            }
        });
        three.setOnAction(event -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 3);
                if (!another) {
                    firstNum = firstNum + "3";
                } else {
                    secondNum = secondNum + "3";
                }
            }
        });
        four.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 4);
                if (!another) {
                    firstNum = firstNum + "4";
                } else {
                    secondNum = secondNum + "4";
                }
            }
        });
        five.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 5);
                if (!another) {
                    firstNum = firstNum + "5";
                } else {
                    secondNum = secondNum + "5";
                }
            }
        });
        six.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 6);
                if (!another) {
                    firstNum = firstNum + "6";
                } else {
                    secondNum = secondNum + "6";
                }
            }
        });
        seven.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 7);
                if (!another) {
                    firstNum = firstNum + "7";
                } else {
                    secondNum = secondNum + "7";
                }
            }
        });
        eight.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 8);
                if (!another) {
                    firstNum = firstNum + "8";
                } else {
                    secondNum = secondNum + "8";
                }
            }
        });
        eight.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 8);
                if (!another) {
                    firstNum = firstNum + "8";
                } else {
                    secondNum = secondNum + "8";
                }
            }
        });
        nine.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 9);
                if (!another) {
                    firstNum = firstNum + "9";
                } else {
                    secondNum = secondNum + "9";
                }
            }
        });
        zero.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + 0);
                if (!another) {
                    firstNum = firstNum + "0";
                } else {
                    secondNum = secondNum + "0";
                }
            }
        });
        doubleZero.setOnAction(actionEvent -> {
            if (!blockNumsInput) {
                calcArea.setText(calcArea.getText() + "00");
                if (!another) {
                    firstNum = firstNum + "00";
                } else {
                    secondNum = secondNum + "00";
                }
            }
        });
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
        plusButton.setOnAction(actionEvent -> {
            mathOperationAction("Plus");
        });
        minusButton.setOnAction(actionEvent -> {
            mathOperationAction("Minus");
        });
        multiplyButton.setOnAction(actionEvent -> {
            mathOperationAction("Multiply");
        });
        divideButton.setOnAction(actionEvent -> {
            mathOperationAction("Divide");
        });
        remOfDivButton.setOnAction(actionEvent -> {
            mathOperationAction("RemOfDiv");
        });
        absButton.setOnAction(actionEvent -> {
            mathOperationAction("Abs");
        });


        calcButton.setOnAction(actionEvent -> {
            if (firstNum != null && secondNum != null && param != null) {
                boolean AbsParsed = true;
                try {
                    Double.parseDouble(secondNum);
                    switch (param) {
                        case "Plus" -> result = Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
                        case "Minus" -> result = Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
                        case "Multiply" -> result = Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
                        case "Divide" -> result = Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
                        case "RemOfDiv" -> result = Double.parseDouble(firstNum) % Double.parseDouble(secondNum);
                        case "Abs" -> {
                            try {
                                result = Math.abs(Double.parseDouble(calcArea.getText()));
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                                AbsParsed = false;
                            }
                        }
                    }
                    if (AbsParsed) {
                        calcArea.setText(String.valueOf(result));
                        param = "";
                        firstNum = "" + result;
                        secondNum = "";
                        result = 0;
                        another = false;
                        mathOperDefined = false;
                        logsField.setText(logsField.getText() + "\nSuccessful second num parse!");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    logsField.setText(logsField.getText() + "\nCan't parse second num!");
                }
            } else logsField.setText(logsField.getText() + "\nWrong numbers input!");
        });
    }

    @FXML
    void initialize() {
        //calcButton.setOnAction(event -> calcArea.setText();
        buttonsHandler();
    }


}
