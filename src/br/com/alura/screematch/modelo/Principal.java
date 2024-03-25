package br.com.alura.screematch.modelo;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Criando uma variável com referencia do tipo br.com.alura.screematch.modelo.Filme
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);

        //Instanciando o objeto e passando valores para os seus atributos
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração em minutos:" + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(7);
        meuFilme.avaliar(6);
        meuFilme.avaliar(8);
        System.out.println(meuFilme.retornaMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());



        Serie lost = new Serie("LOST", 2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        Filme outroFilme = new Filme("Avatar", 2023);
        //Instanciando o objeto e passando valores para os seus atributos
        outroFilme.setDuracaoEmMinutos(200);

        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avaliar(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Primeiro filme: " + listaDeFilmes.get(0).toString());


    }
}

