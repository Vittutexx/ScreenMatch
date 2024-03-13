public class TabuadaMultiplicacao implements Tabuada{

    private int numero;
    @Override
    public int mostrarTabuada() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    return numero;
    }
}
