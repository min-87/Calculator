package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button button_9;
    public Button button_8;
    public Button button_7;
    public Button button_6;
    public Button button_5;
    public Button button_4;
    public Button button_3;
    public Button button_2;
    public Button button_1;
    public Button button_0;
    public Button button_dot;
    public Button button_rez;
    public Button button_div;
    public Button button_mul;
    public Button button_min;
    public Button button_plus;
    public Button button_Clear;
    public Label label_rez;
    public Label label_top;

    public double num1 = 0;
    public double num2 = 0;
    public char operation;
    public double result = 0;


    public void button_9_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "9");
    }

    public void button_8_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "8");
    }

    public void button_7_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "7");
    }

    public void button_6_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "6");
    }

    public void button_5_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "5");
    }

    public void button_4_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "4");
    }

    public void button_3_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "3");
    }

    public void button_2_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "2");
    }

    public void button_1_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "1");
    }

    public void button_0_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + "0");
    }

    public void button_dot_click(ActionEvent event) {
        label_rez.setText(label_rez.getText() + ".");
    }

    public void button_min_click(ActionEvent event) {
        label_top.setText(label_rez.getText() + "-");
        num1 = Double.parseDouble(label_rez.getText());
        operation = '-';
        label_rez.setText("");
    }

    public void button_mul_click(ActionEvent event) {
        label_top.setText(label_rez.getText() + "*");
        num1 = Double.parseDouble(label_rez.getText());
        operation = '*';
        label_rez.setText("");

    }

    public void button_plus_click(ActionEvent event) {
        label_top.setText(label_rez.getText() + "+");
        num1 = Double.parseDouble(label_rez.getText());
        operation = '+';
        label_rez.setText("");
    }
    void button_div_click(ActionEvent event) {
        label_top.setText(label_rez.getText() + "/");
        num1 = Double.parseDouble(label_rez.getText());
        operation = '/';
        label_rez.setText("");
    }
    public void button_Clear_click(ActionEvent event) {
        label_rez.setText("");
        label_top.setText("");
    }
    public void button_rez_click(ActionEvent event) {
        label_top.setText(label_top.getText() + label_rez.getText() + "=");
        num2 = Double.parseDouble(label_rez.getText());
        label_rez.setText(String.valueOf(Calculate()));
        num1 = 0;
        num2 = 0;
        result = 0;
    }
    public double Calculate(){
        switch (operation){
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
        }
        return result;
    }

}
