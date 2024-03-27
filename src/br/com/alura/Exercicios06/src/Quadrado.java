public class Quadrado implements Forma{

    private double comprimento;
    private double altura;

    public Quadrado(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return comprimento * altura;
    }
}
