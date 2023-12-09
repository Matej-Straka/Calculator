package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HelloController {
    private int operace;

    @FXML
    private TextArea displej;

    @FXML
    private void onEqualsClick(){
        String[] s;
        try {
            switch (operace) {
                case 1 -> {
                    System.out.println("plus");
                    s = displej.getText().split("\\+");
                    displej.setText(String.valueOf(Double.parseDouble(s[0]) + Double.parseDouble(s[1])));
                }
                case 2 -> {
                    System.out.println("minus");
                    s = displej.getText().split(" - ");
                    displej.setText(String.valueOf(Double.parseDouble(s[0]) - Double.parseDouble(s[1])));
                }
                case 3 -> {
                    System.out.println("děleno");
                    s = displej.getText().split(" / ");
                    displej.setText(String.valueOf(Double.parseDouble(s[0]) / Double.parseDouble(s[1])));
                }
                case 4 -> {
                    System.out.println("krát");
                    s = displej.getText().split(" X ");
                    displej.setText(String.valueOf(Double.parseDouble(s[0]) * Double.parseDouble(s[1])));
                }
            }
        }catch (NumberFormatException e){
            displej.setText("");
        }
    }
    @FXML
    private void one(){
        displej.setText(displej.getText() + "1");
    }
    @FXML
    private void two(){
        displej.setText(displej.getText() + "2");
    }
    @FXML
    private void three(){
        displej.setText(displej.getText() + "3");
    }
    @FXML
    private void four(){
        displej.setText(displej.getText() + "4");
    }
    @FXML
    private void five(){
        displej.setText(displej.getText() + "5");
    }
    @FXML
    private void six(){
        displej.setText(displej.getText() + "6");
    }
    @FXML
    private void seven(){
        displej.setText(displej.getText() + "7");
    }
    @FXML
    private void eight(){
        displej.setText(displej.getText() + "8");
    }
    @FXML
    private void nine(){
        displej.setText(displej.getText() + "9");
    }
    @FXML
    private void zero(){
        displej.setText(displej.getText() + "0");
    }

    @FXML
    private void decimal(){
        displej.setText(displej.getText() + ".");
    }

    @FXML
    private void plus(){
        displej.setText(displej.getText() + " + \n");
        operace = 1;
    }
    @FXML
    private void minus(){
        displej.setText(displej.getText() + " - \n");
        operace = 2;
    }

    @FXML
    private void division(){
        displej.setText(displej.getText() + " / \n");
        operace = 3;
    }

    @FXML
    private void multiplication(){
        displej.setText(displej.getText() + " X \n");
        operace = 4;
    }

    @FXML
    private void clear(){
        displej.setText("");
    }

    @FXML
    private void backspace(){
        displej.setText(displej.getText(0, displej.getLength() - 1));
    }
}