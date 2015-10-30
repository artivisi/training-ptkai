package com.artivisi.training.weather.client;

public class HaloGetWeather {
    public static void main(String[] args) {
        
        try { // Call Web Service Operation
            net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
            net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap12();
            // TODO initialize WS operation arguments here
            java.lang.String cityName = "";
            java.lang.String countryName = "";
            // TODO process result here
            java.lang.String result = port.getWeather(cityName, countryName);
            System.out.println("Result = "+result);
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
