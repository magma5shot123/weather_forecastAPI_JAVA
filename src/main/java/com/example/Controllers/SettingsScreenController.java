package com.example.Controllers;

import com.example.Managers.ScreenManager;
import com.example.screens.MainScreen;

import javafx.scene.control.Button;

public class SettingsScreenController {

    public SettingsScreenController() {}

    public void handleGoBackButton(Button backButton) {
        backButton.setOnAction(e -> {
            System.out.println("Opening main window...");
            ScreenManager.show(new MainScreen().getRoot());
        });
    }
}
