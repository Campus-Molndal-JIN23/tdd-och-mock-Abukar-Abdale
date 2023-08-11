package org.campusmolndal.abdale;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.json.JSONException;

public class WeatherServiceTest {
    @Mock
    private WeatherAPI mockWeatherAPI;

    private WeatherService weatherService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        weatherService = new WeatherService(mockWeatherAPI);
    }

    @Test
    public void testGetWeather_ValidCity_ReturnsWeatherData() {
        JSONObject mockJsonResponse = createMockJsonResponse(20.0, 5.0, 80, "SE");

        when(mockWeatherAPI.getWeatherData("Gothenburg")).thenReturn(mockJsonResponse);

        WeatherData weatherData = weatherService.getWeather("Gothenburg");

        assertEquals(20.0, weatherData.getTemperature());
        assertEquals(5.0, weatherData.getWindSpeed());
        assertEquals(80, weatherData.getClouds());
        assertEquals("Gothenburg", weatherData.getCity());
        assertEquals("SE", weatherData.getCountry());
    }

    @Test
    public void testGetWeather_InvalidCity_ThrowsJSONException() {
        JSONObject mockJsonResponse = new JSONObject();

        when(mockWeatherAPI.getWeatherData("InvalidCity")).thenReturn(mockJsonResponse);

        assertThrows(JSONException.class, () -> {
            weatherService.getWeather("InvalidCity");
        });
    }

    @Test
    public void testGetWeather_NetworkError_ThrowsJSONException() {
        when(mockWeatherAPI.getWeatherData("NetworkErrorCity")).thenThrow(JSONException.class);

        assertThrows(JSONException.class, () -> {
            weatherService.getWeather("NetworkErrorCity");
        });
    }


    @Test
    public void testGetWeather_ValidCity_NullResponse_ThrowsNullPointerException() {
        when(mockWeatherAPI.getWeatherData("NullResponseCity")).thenReturn(null);

        assertThrows(NullPointerException.class, () -> {
            weatherService.getWeather("NullResponseCity");
        });
    }



    // Helper method to create a mock JSON response
    private JSONObject createMockJsonResponse(double temperature, double windSpeed, int clouds, String country) {
        JSONObject mockJsonResponse = new JSONObject();

        JSONObject mockMainObject = new JSONObject();
        mockMainObject.put("temp", temperature);

        JSONObject mockWindObject = new JSONObject();
        mockWindObject.put("speed", windSpeed);

        JSONObject mockCloudsObject = new JSONObject();
        mockCloudsObject.put("all", clouds);

        JSONObject mockSysObject = new JSONObject();
        mockSysObject.put("country", country);

        mockJsonResponse.put("main", mockMainObject);
        mockJsonResponse.put("wind", mockWindObject);
        mockJsonResponse.put("clouds", mockCloudsObject);
        mockJsonResponse.put("sys", mockSysObject);

        return mockJsonResponse;
    }
}

