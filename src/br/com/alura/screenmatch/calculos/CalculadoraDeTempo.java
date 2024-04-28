package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void incluiTituloNoTotal(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
