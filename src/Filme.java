public class Filme {
    //ATRIBUTOS
    String nome;
    int anoDeLancamento;
    boolean incluidoNopPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //MÉTODOS
    void exibirFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double retornaMedia(){
        double media =  somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }
}
