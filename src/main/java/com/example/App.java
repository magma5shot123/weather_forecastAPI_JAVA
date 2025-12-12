package com.example;

import com.example.Managers.ScreenManager;
import com.example.Models.SettingsModel;
import com.example.screens.MainScreen;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application
{

    private SettingsModel settingsModel = new SettingsModel();

    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ScreenManager.init(primaryStage);
        ScreenManager.show(new MainScreen(settingsModel).getRoot());

        primaryStage.setTitle("WEATHER FORECAST");
        primaryStage.show();
    }
}
