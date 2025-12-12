package com.example.Controllers;

import com.example.Managers.ScreenManager;
import com.example.Models.SettingsModel;
import com.example.Models.Weather;
import com.example.Services.WeatherServices;
import com.example.screens.SettingsScreen;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainScreenController {

    private TextField textField;
    private TextArea weaterOutput;
    private final WeatherServices weatherServices;
    private SettingsModel settingsModel;

    public MainScreenController(TextField textField, TextArea weaterOutput, SettingsModel settingsModel) {
        this.textField = textField;
        this.weaterOutput = weaterOutput;
        this.weatherServices = new WeatherServices();
        this.settingsModel = settingsModel;
    }

    public void handleCheckButton(Button checkButton) {
        checkButton.setOnAction(e -> {
            weaterOutput.clear();
            String city = textField.getText();
            if (city.isEmpty()) {

                System.out.println("Empty line!");
                return;

            } else {
                textField.clear();

                try {
                    Weather weather = weatherServices.getWeather(city, settingsModel.isCelsius());
                
                    this.weaterOutput.setText(
                        "Погода в городе: " + city + "\n" +
                        "Температура: " + weather.getTemperature() + "\n" +
                        "Скорость ветра: " + weather.getWindSpeed() + "\n" +
                        "Ощущается как: " + weather.getFeelsLike() + "\n" +
                        "Влажность: " + weather.getHumidity() + "\n" +
                        "Описание: " + weather.getDescription() + "\n"
                    );
                } catch (Exception ex) {
                    this.weaterOutput.setText("Город не найден!");
                }

                System.out.println("Checking weather in the: " + city + "...");
                
            }
        });
    }
    public void handleSettingsButton(Button settingsButton) {
        settingsButton.setOnAction(e -> {
            System.out.println("Opening settings...");
            ScreenManager.show(new SettingsScreen(settingsModel).getRoot());
        });
    }

    public void handleClearOutputButton(Button clearOutputButton) {
        clearOutputButton.setOnAction(e -> {
            System.out.println("Cleaning output...");
            this.weaterOutput.clear();
        });
    }
}
