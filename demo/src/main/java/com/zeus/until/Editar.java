package com.zeus.until;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;




public class Editar {

    public static void hacerLabelEditable(StackPane contenedor, Label label) {
        
    TextField textField = new TextField(label.getText());

    
    textField.setText(label.getText());
    contenedor.getChildren().setAll(textField);
    textField.requestFocus();

    textField.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
        if (!isNowFocused) {
            label.setText(textField.getText());
            contenedor.getChildren().setAll(label);
            }
        });
    }

}
