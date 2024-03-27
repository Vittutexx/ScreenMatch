package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }

}
