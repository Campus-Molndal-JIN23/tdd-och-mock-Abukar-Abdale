package org.campusmolndal.abdale;


import org.json.JSONObject;

public interface WeatherAPI {
    JSONObject getWeatherData(String city);
}


