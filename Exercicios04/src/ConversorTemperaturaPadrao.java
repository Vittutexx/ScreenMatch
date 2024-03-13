public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    private double celsius;
    private double fahrenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double celsiusParaFahreinheit() {
        return (this.celsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {

        return (this.fahrenheit - 32) * ((double) 5/9);
    }
}
