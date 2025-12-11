package com.example.Controllers;

import com.example.Managers.ScreenManager;
import com.example.screens.SettingsScreen;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainScreenController {

    private TextField textField;
    private TextArea weaterOutput;

    public MainScreenController(TextField textField, TextArea weaterOutput) {
        this.textField = textField;
        this.weaterOutput = weaterOutput;
    }

    public void handleCheckButton(Button checkButton) {
        checkButton.setOnAction(e -> {
            weaterOutput.clear();
            String city = textField.getText();
            if (city.isEmpty()) {
                System.out.println("Empty line!");
                return;
            } else {
                weaterOutput.appendText(city);
                textField.clear();
                System.out.println("Checking weather in the: " + city + "...");
            }
        });
    }
    public void handleSettingsButton(Button settingsButton) {
        settingsButton.setOnAction(e -> {
            System.out.println("Opening settings...");
            ScreenManager.show(new SettingsScreen().getRoot());
        });
    }
}
