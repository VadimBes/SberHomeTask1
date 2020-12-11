class TemperatureConverter {
    private final double temperature;

    TemperatureConverter(double temperatureCelsius){
        this.temperature = temperatureCelsius;
    }

    double convertToFahrenheit(){
        return 9 * temperature / 5 + 32;
    }

    double convertToCalvin(){
        return temperature + 273.15;
    }

    double convertToReomur(){
        return temperature * 0.8;
    }


}
