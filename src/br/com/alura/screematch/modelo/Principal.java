package br.com.alura.screematch.modelo;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        //Criando uma variável com referencia do tipo br.com.alura.screematch.modelo.Filme
        Filme meuFilme = new Filme();
        //Instanciando o objeto e passando valores para os seus atributos
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        System.out.println("Duração em minutos:" + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(7);
        meuFilme.avaliar(6);
        meuFilme.avaliar(8);
        System.out.println(meuFilme.retornaMedia());

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());



        Serie lost = new Serie();

        lost.setNome("LOST");
        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        Filme outroFilme = new Filme();
        //Instanciando o objeto e passando valores para os seus atributos
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
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

    }
}

