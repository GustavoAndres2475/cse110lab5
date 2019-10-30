package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        //return null;

        float value = ((this.getValue() - 32) * 5) / 9;
        return new Fahrenheit(value);

    }

    @Override
    public Temperature toFahrenheit() {
        return this;
        //return null;
    }

    public String toString()
    {
        return this.getValue() + " F";
        //return null;
    }
}