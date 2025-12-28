package com.example.Services;

import com.example.Models.Weather;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherServices {
    
    private static final String API_KEY = "YOU`RE API KEY";

    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";

    private final OkHttpClient client = new OkHttpClient();

    public Weather getWeather (String city, boolean isCelsius) throws Exception {

        String url = BASE_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";

        Request request = new Request.Builder()
            .url(url)
            .build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            throw new Exception("Unexpected code " + response);
        }

        String json = response.body().string();
        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();

        double temperature = obj.getAsJsonObject("main").get("temp").getAsDouble();
        double temperatureFahrenheit = temperature * 9/5 + 32;

        int humidity = obj.getAsJsonObject("main").get("humidity").getAsInt();
        String description = obj.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString();
        double windSpeed = obj.getAsJsonObject("wind").get("speed").getAsDouble();

        double feelsLike = obj.getAsJsonObject("main").get("feels_like").getAsDouble();
        double feelsLikeFahrenheit = feelsLike * 9/5 + 32;

        if (isCelsius) {
            return new Weather(temperature, humidity, description, windSpeed, feelsLike);
        } else {
            return new Weather(temperatureFahrenheit, humidity, description, windSpeed, feelsLikeFahrenheit);
        }

    }

}
