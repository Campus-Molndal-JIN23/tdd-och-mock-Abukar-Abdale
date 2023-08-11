
# TDD - Test-Driven Development Project

## Description

This project demonstrates Test-Driven Development (TDD) principles by creating a weather service application that fetches weather data using an external API. The main goal is to practice writing robust tests for individual classes, such as the `WeatherService` class, using JUnit and Mockito for mock objects. Additionally, this project aims to provide insights into creating effective test reports and understanding the benefits of TDD and mock objects.

### Motivation

The motivation behind this project is to gain hands-on experience in implementing TDD methodologies and writing comprehensive test cases. By following TDD practices, we ensure that the code meets its requirements and functions as expected. This project also provides an opportunity to understand the importance of isolating components for testing using mock objects.

### Problem Solving

The project addresses the challenge of testing a weather service application that relies on an external API. By creating mock objects, we can simulate the behavior of the external API and verify the correct functionality of the `WeatherService` class. This allows us to identify and fix issues early in the development process, ensuring a more reliable and robust application.

### Learning Objectives

Through this project, we aim to achieve the following learning objectives:

- Implement TDD methodologies by writing tests before the actual code.
- Create comprehensive JUnit test cases to validate the functionality of the `WeatherService` class.
- Utilize mock objects (using Mockito) to simulate interactions with external dependencies.
- Gain insights into writing effective test reports that provide clear information about test cases and their outcomes.
- Understand the benefits of TDD in terms of code quality, early issue detection, and improved development workflow.
- Explore the concept of isolating components for testing using mock objects and its relevance in real-world applications.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Credits](#credits)
- [License](#license)

## Installation

To set up and run the project locally, follow these steps:

1. Clone the repository: [Project Repository Link]([https://github.com/yourusername/your-repo-name](https://github.com/Campus-Molndal-JIN23/tdd-och-mock-Abukar-Abdale.git))
2. Navigate to the project directory using a terminal.
3. Ensure you have Java and Maven installed on your system.
4. Build the project using the following command:
   ```sh
   mvn clean install
   ```
5. Run the tests to verify the functionality:
   ```sh
   mvn test
   ```

## Usage

The WeatherService class provides a method to retrieve weather data for a specified city. To use the WeatherService class, follow these steps:

1. Create an instance of the WeatherService class, passing a mock instance of the WeatherAPI class as a parameter.
2. Call the `getWeather` method on the WeatherService instance, providing the name of the city for which you want to fetch weather data.
3. The method will return a WeatherData object containing the temperature, wind speed, cloud coverage, city name, and country code.

Here's an example of how to use the WeatherService class:

```java
WeatherAPI mockWeatherAPI = mock(WeatherAPI.class);
WeatherService weatherService = new WeatherService(mockWeatherAPI);

WeatherData weatherData = weatherService.getWeather("Gothenburg");

System.out.println("Temperature: " + weatherData.getTemperature() + "°C");
System.out.println("Wind Speed: " + weatherData.getWindSpeed() + " m/s");
System.out.println("Cloud Coverage: " + weatherData.getClouds() + "%");
System.out.println("City: " + weatherData.getCity());
System.out.println("Country: " + weatherData.getCountry());
```

## Credits

- [Me](https://github.com/Abukar-Abdale)
- [Teacher](https://github.com/marcusjobb)
- [junit jupiter 5](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.7.0)

## License

[MIT License](https://choosealicense.com/licenses/mit/).

---

## Badges

![Java](https://img.shields.io/badge/Java-%3E%3D%2019-brightgreen.svg)
```

Make sure to replace placeholders like `[yourusername]` and `[your-repo-name]` with actual values from your repository. This revised version organizes and cleans up your README, making it more readable and informative.
