package com.example.screens;

import com.example.Controllers.MainScreenController;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainScreen {
    
    public VBox getRoot() {
        TextArea weatherOutput = new TextArea();
        weatherOutput.setEditable(false);
        weatherOutput.setWrapText(true);

        //Создания текстового поля куда можно вводить текст
        TextField textField = new TextField();
        textField.setPromptText("Entry your city...");
        textField.setPrefWidth(200);

        //Создания контроллера для отслеживания нажатия кнопок
        MainScreenController controller = new MainScreenController(textField, weatherOutput);

        //Кнопка для поиска погоды в введённом городе
        Button checkBtn = new Button("Looking for");
        controller.handleCheckButton(checkBtn);

        //Кнопка для настроек
        Button settingsBtn = new Button("Settings");
        controller.handleSettingsButton(settingsBtn);

        //Горизонтальная линия для расположения кнопок
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(checkBtn, settingsBtn);
        buttonBox.setAlignment(Pos.CENTER);

        //Вериткальная линия для расположения всего
        VBox root = new VBox(10);
        root.getChildren().addAll(weatherOutput, textField, buttonBox);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        return root;
    }
}
