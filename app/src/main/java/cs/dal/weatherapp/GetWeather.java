package cs.dal.weatherapp;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by duncanpulsifer on 2017-03-09.
 */

public class GetWeather {

    private static String locationXML = null;
    private static WeatherForecast weatherForecast = null;

    public GetWeather() { }

    public static void setLocationXML(String newLocation) {
        locationXML = newLocation;
    }

    public static String getLocationXML() { return locationXML; };

    public static void setWeatherForecast(WeatherForecast newWeatherForecast) {
        weatherForecast = newWeatherForecast;
    }

    public static WeatherForecast getWeatherForecast() { return weatherForecast; }



}
