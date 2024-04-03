package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avaliar(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avaliar(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avaliar(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClasssificacao() > 2) {
                System.out.println("Classificação " + filme.getClasssificacao());


            }//if
        }//for


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("\nDepois da ordenação do colletions: \n" + buscaPorArtista);
        System.out.println("\nLista de titulos ordenados: \n" + lista);
        Collections.sort(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: \n" + lista);

    }//main
}//class