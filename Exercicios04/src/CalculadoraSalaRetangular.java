public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private int altura;
    private int largura;


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (this.altura + this.largura) * 2;
    }
}
