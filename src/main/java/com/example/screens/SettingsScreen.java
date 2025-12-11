package com.example.screens;

import com.example.Controllers.SettingsScreenController;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SettingsScreen {
    

    public VBox getRoot() {

        SettingsScreenController controller = new SettingsScreenController();

        ToggleGroup tempGroup = new ToggleGroup();

        RadioButton celiusButton = new RadioButton("°C");
        celiusButton.setSelected(true);
        RadioButton fahrenheitButton = new RadioButton("°F");

        Button changeTheme = new Button("Change Theme");
        Button clearData = new Button("Clear all data");
        Button backButton = new Button("Go back");
        controller.handleGoBackButton(backButton);


        celiusButton.setToggleGroup(tempGroup);
        fahrenheitButton.setToggleGroup(tempGroup);

        HBox tempToggleBox = new HBox(10);
        tempToggleBox.getChildren().addAll(celiusButton, fahrenheitButton);
        tempToggleBox.setAlignment(Pos.CENTER);

        HBox buttonHBox = new HBox(10);
        buttonHBox.getChildren().addAll(changeTheme, clearData, backButton);
        buttonHBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(10);
        root.getChildren().addAll(tempToggleBox, buttonHBox);
        root.setAlignment(Pos.CENTER);

        root.getStylesheets().add(getClass().getResource("/styles/SettingsScreenStyle.css").toExternalForm());

        return root;
    }
}
