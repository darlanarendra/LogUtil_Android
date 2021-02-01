package com.converter.temperatureconverter;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {

    @Test
    public void celciusToReamur() {
        double result = Temperature.Celcius.convert(5, Temperature.Reamur);
        Assert.assertEquals(4.0,  result, 0);
    }

    @Test
    public void celciusToFahrenheit() {
        double result = Temperature.Celcius.convert(5, Temperature.Fahrenheit);
        Assert.assertEquals(41.0,  result, 0);
    }

    @Test
    public void celciusToKelvin() {
        double result = Temperature.Celcius.convert(1, Temperature.Kelvin);
        Assert.assertEquals(274.0,  result, 0);
    }

    @Test
    public void reamurToCelcius() {
        double result = Temperature.Reamur.convert(4, Temperature.Celcius);
        Assert.assertEquals(5.0,  result, 0);
    }

    @Test
    public void reamurToFahrenheit() {
        double result = Temperature.Reamur.convert(5, Temperature.Fahrenheit);
        Assert.assertEquals(43.25,  result, 0);
    }

    @Test
    public void reamurToKelvin() {
        double result = Temperature.Reamur.convert(1, Temperature.Kelvin);
        Assert.assertEquals(274.25,  result, 0);
    }
}
