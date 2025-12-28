# Weather Forecast API Java

Desktop application for viewing weather forecasts built with **JavaFX** and **Java 25**.  
The application fetches weather data from **OpenWeather API** and displays it in a simple JavaFX interface.  
The project is ready to run out-of-the-box.

---

## Tech Stack

- Java 25  
- JavaFX  
- OpenWeather API  
- Maven  
- Jackson (for JSON parsing)  

---

## Architecture

### Client (JavaFX)
- `api` — fetch weather data from OpenWeather API  
- `controller` — JavaFX controllers  
- `model` — weather data models  
- `view` — FXML UI files  

---

## How to Run

1. **Clone the repository**

```bash
git clone https://github.com/your-username/weather_forecastAPI_JAVA.git
cd weather_forecastAPI_JAVA
```
Set your OpenWeather API key

Open the api/WeatherService.java (or wherever your API key is stored)

Replace YOUR_API_KEY with your personal OpenWeather API key

```
private static final String API_KEY = "YOUR_API_KEY";
```
Run the JavaFX application

```
mvn javafx:run
```
Or run the project directly from your IDE.

The application window will open, and you can search for cities to view current weather and forecast.

Notes
The app fetches live weather data from OpenWeather API, so an internet connection is required.

Make sure your JavaFX SDK is configured correctly if running from IDE.

Team
Dima Polegenkii — Developer (JavaFX + Java 25) — tg://resolve?domain=dima_polegenkii
