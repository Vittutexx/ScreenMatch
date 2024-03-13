//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;
    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterDolarParaReal() {
        return this.dolar * 4.97;
    }

}
    