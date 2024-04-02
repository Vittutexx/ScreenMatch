public class Circulu implements Forma{

    private double pi = 3.14;
    private double raio;




    public Circulu(double pi, double raio) {
        this.pi = pi;
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * Math.pow(raio, 2);
    }
}
