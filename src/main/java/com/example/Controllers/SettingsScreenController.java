package com.example.Controllers;

import com.example.Managers.ScreenManager;
import com.example.Models.SettingsModel;
import com.example.screens.MainScreen;

import javafx.scene.control.Button;

public class SettingsScreenController {

    public SettingsScreenController() {}

    public void handleGoBackButton(Button backButton, SettingsModel settingsModel) {
        backButton.setOnAction(e -> {
            System.out.println("Opening main window...");
            ScreenManager.show(new MainScreen(settingsModel).getRoot());
        });
    }

    public void handleChangeThemeButton(Button changeThemeButton) {
        changeThemeButton.setOnAction(e -> {
            System.out.println("Changing theme...");
        }); 
    }

    public void handleClearDataButton(Button clearDataButton) {
        clearDataButton.setOnAction(e -> {
            System.out.println("Clearing all data...");
        }); 
    }
}
