package org.campusmolndal.abdale;

import org.json.JSONException;
import org.json.JSONObject;

public class WeatherService {
    private final WeatherAPI weatherAPI;

    public WeatherService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }public WeatherData getWeather(String city) {
        JSONObject jsonWeatherData = weatherAPI.getWeatherData(city);

        JSONObject mainObject = jsonWeatherData.optJSONObject("main");
        if (mainObject == null) {
            throw new JSONException("Key 'main' not found in JSON response");
        }

        double temperature = mainObject.optDouble("temp");
        double windSpeed = jsonWeatherData.optJSONObject("wind").optDouble("speed");
        int clouds = jsonWeatherData.optJSONObject("clouds").optInt("all");
        String country = jsonWeatherData.optJSONObject("sys").optString("country");

        return new WeatherData(temperature, windSpeed, clouds, city, country);
    }


}



