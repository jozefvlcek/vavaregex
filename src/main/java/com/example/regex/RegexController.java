package com.example.regex;

import javafx.fxml.FXML;
import java.util.regex.*;

import javafx.scene.control.*;

public class RegexController {
    @FXML
    private TextArea textarea1;

    @FXML
    private TextField textfield1;

    @FXML
    private RadioButton radiobutton1;




    @FXML
    protected void isMatched() {
        Pattern p;

        if (radiobutton1.isSelected()){
            p = Pattern.compile(textfield1.getText(),Pattern.LITERAL);
        }
        else{
            p = Pattern.compile(textfield1.getText());
        }
        Matcher m = p.matcher(textarea1.getText());
        boolean b = m.matches();
        String output = "";

        if (b) {
            output = "OK";
        }
        else{
            output = "NG";
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.getDialogPane().lookupButton(ButtonType.OK).setStyle("-fx-font-family: 'serif'");
        alert.getDialogPane().setStyle("-fx-font-family: 'serif'");
        alert.setTitle("vysledok");
        alert.setHeaderText(null);
        alert.setContentText(output);

        alert.showAndWait();
    }
}