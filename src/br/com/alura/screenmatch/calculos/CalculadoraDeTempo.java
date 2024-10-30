package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoDeMaratona;

//    public void incluiNaLista(Serie serie) {
//        this.tempoDeMaratona += serie.getDuracaoEmMinutos();
//    }
//
//    public void incluiNaLista(Filme filme) {
//        this.tempoDeMaratona += filme.getDuracaoEmMinutos();
//    }

    public void incluiNaLista(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoDeMaratona += titulo.getDuracaoEmMinutos();
    }

    public int getTempoDeMaratona() {
        return this.tempoDeMaratona;
    }
}

