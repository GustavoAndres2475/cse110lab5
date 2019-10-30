package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
        //return null;
    }

    @Override
    public Temperature toFahrenheit() {

        float value = ((this.getValue() * 9) / 5) + 32;
        return new Fahrenheit(value);

        //return null;
    }

    public String toString()
    {
        return this.getValue() + " C";
        //return null;
    }
}
