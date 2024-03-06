package br.com.alura.screematch.modelo;

public class Filme {
    //ATRIBUTOS
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNopPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

        //GETTERS
        int getTotalDeAvaliacoes(){
            return totalDeAvaliacoes;
        }
        //SETTERS
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setIncluidoNopPlano(boolean incluidoNopPlano) {
            this.incluidoNopPlano = incluidoNopPlano;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

    //MÉTODOS
    public void exibirFichaTecnica(){
        System.out.println("Nome do br.com.alura.screematch.modelo.Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double retornaMedia(){
        double media =  somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }
}
