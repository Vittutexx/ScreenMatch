public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;

    void fichaTecnica(){
        System.out.println("===================\n");
        System.out.println("Título da Musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento + "\n");
        System.out.println("===================\n");
    }
    void avaliarMusica(int nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        int total = avaliacao / numAvaliacoes;
        System.out.println("A média de avaliações de acordo com suas próprias avaliações é de: " + total);
    return total;
    }

}
