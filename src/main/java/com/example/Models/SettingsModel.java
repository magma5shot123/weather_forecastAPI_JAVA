package com.example.Models;

public class SettingsModel {
    
    private boolean isCelsius;
    private boolean isFahrenheit;

    public SettingsModel() {
        this.isCelsius = true;
        this.isFahrenheit = false;
    }

    public boolean isCelsius() {
        return this.isCelsius;
    }

    public boolean isFahrenheit() {
        return this.isFahrenheit;
    }

    public void setCelsius(boolean isCelsius) {
        if (isCelsius) {
            this.isCelsius = isCelsius;
            this.isFahrenheit = false;
        } else {
            this.isCelsius = false;
            this.isFahrenheit = true;
        }
    }

}
